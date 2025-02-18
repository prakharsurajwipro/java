package com.wipro.java.ussecase4;




import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    static final String DB_URL = "jdbc:mysql://localhost:3306/game_db";
    static final String USER = "root";
    static final String PASS = "suraj";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.println("Welcome to the Number Guessing Game, " + playerName + "!");
        System.out.println("Guess a number between 1 and 100:");

        do {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations, " + playerName + "! You guessed the number in " + attempts + " attempts.");
                saveScore(playerName, attempts);
            }
        } while (guess != numberToGuess);

        scanner.close();
    }

    private static void saveScore(String playerName, int attempts) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO scores (player_name, attempts) VALUES (?, ?)");) {
            stmt.setString(1, playerName);
            stmt.setInt(2, attempts);
            stmt.executeUpdate();
            System.out.println("Score saved successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
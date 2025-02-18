package com.wipro.java.collection;




import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class GameDatabase {
    // Database connection credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/game_db";
    private static final String USER = "root";
    private static final String PASS = "suraj";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = -1;

        // Get player's name
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine().trim();

        if (playerName.isEmpty()) {
            System.out.println("Name cannot be empty. Please restart the game.");
            return;
        }

        System.out.println("\nWelcome to the Number Guessing Game, " + playerName + "!");
        System.out.println("Guess a number between 1 and 100:");

        // Game loop
        while (true) {
            System.out.print("Your guess: ");
            
            // Handle invalid input
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("\n🎉 Congratulations, " + playerName + "! You guessed the number in " + attempts + " attempts.");
                saveScore(playerName, attempts);
                break;
            }
        }

        scanner.close();
    }

    // Method to save score in the database
    private static void saveScore(String playerName, int attempts) {
        String query = "INSERT INTO scores (player_name, attempts) VALUES (?, ?)";

        try {
            // Load MySQL JDBC driver (important in some cases)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 PreparedStatement stmt = conn.prepareStatement(query)) {

                stmt.setString(1, playerName);
                stmt.setInt(2, attempts);
                stmt.executeUpdate();
                System.out.println(" Score saved successfully!");

            } catch (SQLException e) {
                System.out.println(" Error saving score: " + e.getMessage());
            }

        } catch (ClassNotFoundException e) {
            System.out.println(" MySQL JDBC Driver not found. Please ensure it is added to the project.");
        }
    }
}


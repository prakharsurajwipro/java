package com.wipro.java.usecase3;

import java.util.Scanner;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private static final char PLAYER_X = 'X';
	private static final char PLAYER_O = 'O';
	private static char[][] board = new char[3][3];
	private static char currentPlayer = PLAYER_X;

	public static void main(String[] args) {
		initializeBoard();
		playGame();
	}

	// Initialize the Tic-Tac-Toe board with empty spaces
	private static void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = EMPTY;
			}
		}
	}

	// Display the Tic-Tac-Toe board
	private static void displayBoard() {
		System.out.println("Current Board:");
		for (int i = 0; i < 3; i++) {
			System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
			if (i < 2) {
				System.out.println("---+---+---");
			}
		}
	}

	// Play the game with alternating turns
	private static void playGame() {
		Scanner scanner = new Scanner(System.in);
		boolean gameWon = false;
		int moves = 0;

		while (!gameWon && moves < 9) {
			displayBoard();
			System.out.println("Player " + currentPlayer + ", enter row (0-2) and column (0-2): ");
			int row = scanner.nextInt();
			int col = scanner.nextInt();

			if (isValidMove(row, col)) {
				board[row][col] = currentPlayer;
				moves++;

				if (checkWinner(currentPlayer)) {
					displayBoard();
					System.out.println("Player " + currentPlayer + " wins!");
					gameWon = true;
				} else {
					currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
				}
			} else {
				System.out.println("Invalid move. Try again.");
			}
		}

		if (!gameWon) {
			displayBoard();
			System.out.println("It's a draw!");
		}

		scanner.close();
	}

	// Validate the player's move
	private static boolean isValidMove(int row, int col) {
		return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY;
	}

	// Check if the current player has won
	private static boolean checkWinner(char player) {
		// Check rows and columns
		for (int i = 0; i < 3; i++) {
			if ((board[i][0] == player && board[i][1] == player && board[i][2] == player)
					|| (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
				return true;
			}
		}

		// Check diagonals
		return (board[0][0] == player && board[1][1] == player && board[2][2] == player)
				|| (board[0][2] == player && board[1][1] == player && board[2][0] == player);
	}
}

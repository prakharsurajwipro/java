package com.wipro.java.collection;

import java.util.Scanner;


class LinkedInUserNode {
	String name;
	String jobTitle;
	String company;
	LinkedInUserNode next;

	// Constructor
	public LinkedInUserNode(String name, String jobTitle, String company) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.company = company;
		this.next = null;
	}
}

//Custom LinkedList class
class LinkedInUserList {
	private LinkedInUserNode head;

	// Method to add a user to the list
	public void addUser(String name, String jobTitle, String company) {
		LinkedInUserNode newNode = new LinkedInUserNode(name, jobTitle, company);
		if (head == null) {
			head = newNode;
		} else {
			LinkedInUserNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	// Method to display all users
	public void displayUsers() {
		if (head == null) {
			System.out.println("No LinkedIn users in the list.");
			return;
		}
		LinkedInUserNode temp = head;
		System.out.println("\nLinkedIn User List:");
		while (temp != null) {
			System.out.println("Name: " + temp.name + ", Job Title: " + temp.jobTitle + ", Company: " + temp.company);
			temp = temp.next;
		}
	}

	// Method to delete a user by name
	public void deleteUser(String name) {
		if (head == null) {
			System.out.println("List is empty. Cannot delete.");
			return;
		}
		if (head.name.equalsIgnoreCase(name)) {
			head = head.next;
			System.out.println(name + " has been deleted.");
			return;
		}
		LinkedInUserNode temp = head;
		while (temp.next != null && !temp.next.name.equalsIgnoreCase(name)) {
			temp = temp.next;
		}
		if (temp.next == null) {
			System.out.println("User not found.");
		} else {
			temp.next = temp.next.next;
			System.out.println(name + " has been deleted.");
		}
	}
}

//Main class
public class LinkedInList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedInUserList userList = new LinkedInUserList();

		while (true) {
			System.out.println("\n1. Add LinkedIn User");
			System.out.println("2. Display LinkedIn Users");
			System.out.println("3. Delete a User");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Job Title: ");
				String jobTitle = scanner.nextLine();
				System.out.print("Enter Company: ");
				String company = scanner.nextLine();
				userList.addUser(name, jobTitle, company);
				System.out.println("User added successfully!");
				break;
			case 2:
				userList.displayUsers();
				break;
			case 3:
				System.out.print("Enter Name of User to Delete: ");
				String deleteName = scanner.nextLine();
				userList.deleteUser(deleteName);
				break;
			case 4:
				System.out.println("Exiting Program...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
}

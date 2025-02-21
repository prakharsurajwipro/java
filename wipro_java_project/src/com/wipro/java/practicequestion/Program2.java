package com.wipro.java.practicequestion;

import java.util.Scanner;

/**
 * T -> Type parameter --> it can be any type of data type
 */
class Stack<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
    }


    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        return isEmpty() ? null : top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class Program2 {
    public static void main(String[] args) 
    {
    	/*
    	 * Integer type stack
    	 */
    	Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            integerStack.push(userInput);
        }


        System.out.println("Peek: " + integerStack.peek());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());


        /*
    	 * String type stack
    	 */
        Stack<String> stringStack = new Stack<>();
        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            stringStack.push(userInput);
        }

        System.out.println("Peek: " + stringStack.peek());
        scanner.close();
    }
}

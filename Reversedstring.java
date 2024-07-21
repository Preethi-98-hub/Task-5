package com.Task5;
import java.util.Scanner;
public class Reversedstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Create an empty string to store the reversed string
        String reversed = "";

        // Use a loop to reverse the order of characters in the input string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);

        // Close the scanner
        scanner.close();
    }

	}



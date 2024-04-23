package com.intern.java;
import java.util.Scanner;

public class UppercaseWithoutInbuiltMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Convert characters to uppercase (ASCII manipulation)
        for (int i = 0; i < charArray.length; i++) {
            // Check if character is lowercase
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                // Convert lowercase character to uppercase by subtracting 32 from its ASCII value
                charArray[i] = (char) (charArray[i] - 32);
            }
        }

        // Convert character array back to string
        String result = new String(charArray);

        // Output the result
        System.out.println("String in uppercase: " + result);

        scanner.close();
    }
}

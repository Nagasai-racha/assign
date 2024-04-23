package com.intern.java;

import java.util.Scanner;

public class ReverseArray {
    public static void printReverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Declare and initialize the array with consecutive numbers
        int[] array = new int[10]; // Example: Array of size 10
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Array in reverse order: ");
        printReverseArray(array);
    }
}
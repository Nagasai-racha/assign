package com.intern.java;

public class SumArray {
    public static int sumArray(int[] arr, int index) {
        // Base case: if index is out of bounds, return 0
        if (index < 0 || index >= arr.length) {
            return 0;
        }
        // Recursive case: add current element and sum of remaining elements
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};
        
        // Calculate sum of array elements
        int sum = sumArray(array, 0);
        
        // Print the result
        System.out.println("Sum of array elements: " + sum);
    }
}

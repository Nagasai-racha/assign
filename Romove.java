package com.intern.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Romove {
	 public static void removeEverySecondElement(List<Integer> list) {
	        // Create an iterator to iterate through the list
	        Iterator<Integer> iterator = list.iterator();
	        int index = 0;
	        
	        // Iterate through the list
	        while (iterator.hasNext()) {
	            iterator.next(); // Move to the next element
	            
	            // Check if the current index is odd (every second element)
	            if (index % 2 != 0) {
	                iterator.remove(); // Remove the element
	            }
	            
	            index++; // Move to the next index
	        }
	        
	        // Print the resulting list
	        System.out.println("Resulting list after removing every second element: " + list);
	    }
	 public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	        removeEverySecondElement(list);
	}
}

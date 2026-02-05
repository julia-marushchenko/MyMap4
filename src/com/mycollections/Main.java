/**
 *  Java program to find frequencies of numbers in array.
 */

package com.mycollections;

import java.util.HashMap;

/**
 *  Main class.
 */
public class Main {
    
    // Method to find frequencies of numbers.
    public static HashMap<Integer, Integer> printFrequencies(int arr[]) {

        // Creating an empty map.
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Iterate though given array.
        for (int i = 0; i < arr.length; i++) {

            // Creating number to store number of occurrences.
            Integer number = hm.get(arr[i]);

            // First occurrence.
            if (hm.get(arr[i]) == null) {

                // Adding number with occurrences value to a map hm.
                hm.put(arr[i], 1);

            } else {

                // If element already is present in a map named hm.
                hm.put(arr[i], ++number);

            }
        }

        return hm;
    }


    public static void main(String[] args) {

        // Creating an empty array.
        int[] arr = {3, 5, 6, 7, 8, 1, 5, 3, 7, 8, 8, 9, 12, 11};

        // Calling method printFrequencies() and printing result to console.
        System.out.println(Main.printFrequencies(arr));

    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author PC
 */
import java.util.Arrays;
import java.util.Scanner;
public class Baitap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         displayEvenNumbers();
         performArrayOperations();
    }
    public static void displayEvenNumbers() {
        System.out.println("Even numbers from 2 to 10 (using for loop):");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("Even numbers from 2 to 10 (using while loop):");
        displayEvenNumbersWhileLoop();
    }

  
    public static void displayEvenNumbersWhileLoop() {
        int i = 2;
        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
    }
    public static void performArrayOperations() {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        int[] array = new int[numElements];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numElements; i++) {
            array[i] = scanner.nextInt();
        
}
        System.out.println("Array elements:");
        displayArrayElements(array);

        // Sort all numbers in ascending order
        Arrays.sort(array);
        System.out.println("Array elements after sorting in ascending order:");
        for (int i = 0; i < numElements; i++) {
            System.out.println(array[i]);
        }

        // Find the maximum value
        int max = findMaximumValue(array);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
    public static void displayArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Helper method to find the maximum value in an array
    public static int findMaximumValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
}

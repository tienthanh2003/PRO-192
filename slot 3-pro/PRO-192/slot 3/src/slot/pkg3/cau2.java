/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot.pkg3;

/**
 *
 * @author PC
 */
import java.util.Arrays;
import java.util.Scanner;
public class cau2 {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
         System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        
        double average = calculateAverage(array);

        
        int min = cau2(array, average);

        
        System.out.println("Mảng: " + Arrays.toString(array));
        System.out.println("Trung bình: " + average);
        System.out.println("Giá trị nhỏ nhất gần trung bình: " + min);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static int cau2(int[] array, double average) {
        int minValue = array[0];
        double minDifference = Math.abs(array[0] - average);

        for (int i = 1; i < array.length; i++) {
            double difference = Math.abs(array[i] - average);
            if (difference < minDifference) {
                minDifference = difference;
                minValue = array[i];
            }
        }

        return minValue;
    }
}


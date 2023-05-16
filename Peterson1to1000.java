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
public class Peterson1to1000 {
     public static void main(String[] args) {
        System.out.println("Các số Peterson từ 1 đến 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPetersonNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPetersonNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

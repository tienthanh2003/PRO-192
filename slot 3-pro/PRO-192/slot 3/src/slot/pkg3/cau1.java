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


import java.util.Scanner;

/**
 *
 * @author PC
 */
public class cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thu nhat");
        float a = scanner.nextFloat();
        System.out.println("nhap so thu hai");
        float b = scanner.nextFloat();
        System.out.println("nhap so thu ba");
        float c = scanner.nextFloat();
         float max = cau1(a, b, c);

        System.out.println("Giá trị lớn nhất là: " + max);
        // TODO code application logic here
    }
    public static float cau1(float a,  float b, float c) {
        float max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}

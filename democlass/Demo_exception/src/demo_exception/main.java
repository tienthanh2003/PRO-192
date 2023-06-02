/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_exception;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner nhap = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter integer a: ");
                a = nhap.nextInt();

                System.out.print("Enter integer b: ");
                b = nhap.nextInt();

                System.out.print("Enter integer c: ");
                c = nhap.nextInt();

                RightTriangle rt = new RightTriangle(a, b, c);
                System.out.println("This is a right triangle!");
            } catch (IllegalTriangleException e1) {
                System.out.println("This is not a triangle!");
            } catch (IllegalRightTriangleException e2) {
                System.out.println("This is not a right triangle!");
            }

            System.out.print("Continue? (Y/N): ");
            char chon = nhap.next().charAt(0);
            if (chon != 'Y')
                break;
        }
    }
}

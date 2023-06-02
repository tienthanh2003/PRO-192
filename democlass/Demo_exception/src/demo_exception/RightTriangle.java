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
public class RightTriangle  {
    private int a, b, c;

    public RightTriangle(int a, int b, int c) throws IllegalTriangleException, IllegalRightTriangleException {
        if (!isTriangle(a, b, c)) {
            throw new IllegalTriangleException("Invalid triangle sides");
        }

        if (!isRightTriangle(a, b, c)) {
            throw new IllegalRightTriangleException("Invalid right triangle sides");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static boolean isRightTriangle(int a, int b, int c) {
        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }
    
}

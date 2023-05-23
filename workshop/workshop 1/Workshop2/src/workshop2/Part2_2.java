/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Part2_2 {
    private static final Scanner sc = new Scanner(System.in);
    private static final String pattern = "[SE]\\d{3}";

    public String inputString() throws Exception {
        System.out.print("Input the string: ");
        String s = sc.nextLine();

        if (!s.matches(pattern)) {
            throw new Exception();
        }

        return s;
    }

    public static void main(String[] args) {
        Part2_2 obj = new Part2_2();
        boolean cont = false;

        do {
            try {
                String s = obj.inputString();
                System.out.println("The string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        } while (cont);
    }
}


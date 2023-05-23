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
public class part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        boolean cont = false;

        do {
            try {
                int num;

                System.out.println("Enter the number: ");
                num = sc.nextInt();

                if (num < 1) {
                    throw new Exception();
                }

                System.out.println("The number is " + num);

                cont = false;
            } catch (Exception e) {
                System.out.println("The number is invalid");

                cont = true;
            }
        } while (cont);
    }
    
}

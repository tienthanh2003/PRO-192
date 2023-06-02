/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Book {
   private String title;
    private int price;

    public Book() {
        // Default constructor
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void testTitle() {
        System.out.println("OUTPUT:");
        System.out.println(getTitle());
    }

    public void testSetPrice(Scanner scanner) {
        System.out.print("Enter new price: ");
        int newPrice = scanner.nextInt();
        setPrice(newPrice);

        System.out.println("OUTPUT:");
        System.out.println(getPrice());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot9;

/**
 *
 * @author Dell
 */
public class Demo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Restangle s=new Restangle();
        s.setValue(5);
        System.out.println(s.toString());
        s.setValue(10,20);
        System.out.println(s.toString());
        Box b=new Box();
        b.set(5,10,15);
        System.out.println(b.toString());
    }
    
}

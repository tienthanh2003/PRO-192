/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot12.sort;

/**
 *
 * @author PC
 */
import java.util.Comparator;

/**
 *
 * @author Hoang Dang Duc
 */
   public class Employee implements Comparable{
    String ID="", name="";
    int salary=0;
    public Employee(String id, String n, int s){
        ID = id; name = n; salary =s;
}
 @Override
 public String toString(){
     return ID + "," + name + "," + salary;
 }
 @Override
 public int compareTo(Object emp){
     return ID.compareTo(((Employee)emp).ID);
 }
public static Comparator compareObj = (Comparator) (Object e1, Object e2) -> {
    Employee emp1 = (Employee) e1;
    Employee emp2 = (Employee) e2;
    int d = emp1.salary - emp2.salary;
    if (d>0) return -1;
    if (d==0) return emp1.ID.compareTo(emp2.ID);
    return 1;
    };
}
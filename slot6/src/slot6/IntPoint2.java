/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot6;

/**
 *
 * @author Dell
 */
public class IntPoint2 {
    int x=7;
    int y=3;
    public IntPoint2()
    {
        output();
        x=100;
        y=1000;
        output();
    }
    public IntPoint2(int x, int y){
    output();
    this.x=x;
    this.y=y;
    output();
}
    public void output(){
        String S="["+x+"]"+"["+y+"]";
        System.out.println(S);
    }
}

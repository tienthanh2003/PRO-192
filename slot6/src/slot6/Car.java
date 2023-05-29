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
public class Car {
    private String Colour;
    private int Enginepower;
    private boolean Convertible;
    private boolean parkingBrake;
    public Car(){
        Colour = "";
        Enginepower = 0;
        Convertible = false;
        parkingBrake = false;
        
    } 
    public Car(String Colour, int Enginepower, boolean Convertible, boolean parkingBrake)
    {
        this.Colour = Colour;
        this.Enginepower= Enginepower;
        this.Convertible= Convertible;
        this.parkingBrake= parkingBrake;
        
    }
    public void pressStartButton()
    {
        System.out.println("You can press the start button");
    }
     public void pressAcceleratorButton()
    {
        System.out.println("You can press the accelerator button");
         System.out.println("Colour: "+Colour);
        System.out.println("Enginepower: "+Enginepower);
        System.out.println("Convertible" + Convertible);
        System.out.println("parkingBrake:"+parkingBrake);

    }
     public void setColour(String Colour)
     {
         this.Colour=Colour;
     }
     public String setColour()
     {
         return Colour;
     }
     public int getEnginepower()
     {
         return Enginepower;
     }
     public void getEnginepower(int  Enginepower)
     {
         this.Enginepower=Enginepower;
     }
     public boolean isConvertible()
     {
         return Convertible;
     }
     public void setConvertible(boolean Convertible)
     {
         this.Convertible=Convertible;
     }
         public boolean isparkingBrake()
     {
         return parkingBrake;
     }
     public void setparkingBrake(boolean parkingBrake)
     {
         this.parkingBrake=parkingBrake;
     }
     public static void main (String[] args)
     {
         Car c=new Car();
         c.pressStartButton();
         c.pressAcceleratorButton();
         
         Car c2=new Car();
         c2.pressAcceleratorButton();
         Car c3 = new Car ("Red",100,true,true);
         c3.pressAcceleratorButton();
         c3.setColour("black");
         System.out.print("Colour of c3: " +c3.setColour());
     }
    }


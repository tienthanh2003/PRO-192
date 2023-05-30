/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_manager;

/**
 *
 * @author PC
 */
public class Car {

    /**
     * @param args the command line arguments
     */
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car() {
        this.colour = "";
    }

    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    // Getter
    public String getColour() {
        return colour;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    // Setter
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    @Override
    public String toString() {
        return "Car{" + "colour=" + colour + ", enginePower=" + enginePower + ", convertible=" + convertible + ", parkingBrake=" + parkingBrake + '}';
    }
    
}

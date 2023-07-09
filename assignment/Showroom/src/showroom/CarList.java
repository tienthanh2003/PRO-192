/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showroom;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CarList {
    private List<Car> cars;
    private BrandList brandList;

    public CarList(BrandList brandList) {
        this.brandList = brandList;
        this.cars = new ArrayList<>();
    }

    public boolean loadCarsFromFile(String filename) {
        try {
            File file = new File(filename);
            if (!file.exists()) {
                return false;
            }

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] carInfo = line.split(", ");

                if (carInfo.length == 5) {
                    String carID = carInfo[0].trim();
                    String brandID = carInfo[1].trim();
                    String color = carInfo[2].trim();
                    String frameID = carInfo[3].trim();
                    String engineID = carInfo[4].trim();

                    Brand brand = findBrandByID(brandID);
                    if (brand != null) {
                        Car car = new Car(carID, brand, color, frameID, engineID);
                        cars.add(car);
                    } else {
                        System.out.println("Invalid brand ID: " + brandID);
                    }
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }

            scanner.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (Car car : cars) {
                writer.write(car.toString() + "\n");
            }
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int searchID(String carID) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCarID().equals(carID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchFrame(String frameID) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getFrameID().equals(frameID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchEngine(String engineID) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getEngineID().equals(engineID)) {
                return i;
            }
        }
        return -1;
    }

    public void addCar() {
        // TODO: Implement logic to add a car
    }

    public void printBasedBrandName(String aPartOfBrandName) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().getBrandName().contains(aPartOfBrandName)) {
                System.out.println(car.screenString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No car is detected!");
        }
    }

    public boolean removeCar(String removedID) {
        int pos = searchID(removedID);
        if (pos >= 0) {
            cars.remove(pos);
            return true;
        } else {
            System.out.println("Not found!");
            return false;
        }
    }

    public boolean updateCar(String updatedID) {
        int pos = searchID(updatedID);
        if (pos >= 0) {
            // TODO: Implement logic to update a car
            return true;
        } else {
            System.out.println("Not found!");
            return false;
        }
    }

    public void listCars() {
        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car.screenString());
        }
    }

    private Brand findBrandByID(String brandID) {
        for (Brand brand : brandList.getBrands()) {
            if (brand.getBrandID().equals(brandID)) {
                return brand;
            }
        }
        return null;
    }
}




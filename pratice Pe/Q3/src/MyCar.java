/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCar implements ICar {

    @Override
    public int f1(List<Car> t) {
        int sum = 0;
        sum = t.stream().map((car) -> car.getRate()).reduce(sum, Integer::sum);
        return sum / t.size();
    }

    @Override
    public void f2(List<Car> t) {
        int maxIndex = 0;
        int minIndex = 0;
        int maxRate = Integer.MIN_VALUE;
        int minRate = Integer.MAX_VALUE;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() > maxRate) {
                maxRate = t.get(i).getRate();
                maxIndex = i;
            }
            if (t.get(i).getRate() < minRate) {
                minRate = t.get(i).getRate();
                minIndex = i;
            }
        }
        Collections.swap(t, maxIndex, minIndex);
    }

    @Override
    public void f3(List<Car> t) {
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                if (car1.getMaker().equals(car2.getMaker())) {
                    return car2.getRate() - car1.getRate();
                } else {
                    return car1.getMaker().compareTo(car2.getMaker());
                }
            }
        };
        Collections.sort(t, comparator);
    }
}

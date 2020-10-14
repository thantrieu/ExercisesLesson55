package net.braniumacademy.ex2.comparator;

import net.braniumacademy.ex2.Vehicle;

import java.util.Comparator;

// sắp xếp theo giá từ cao -> thấp
public class SortByPriceDESC implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if (o2.getPrice() < o1.getPrice()) {
            return -1;
        }
        if (o2.getPrice() == o1.getPrice()) {
            return 0;
        }
        return 1;
    }
}

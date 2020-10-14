package net.braniumacademy.ex2.comparator;

import net.braniumacademy.ex2.Vehicle;

import java.util.Comparator;

public class SortByWeightASC implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        if (o1.getWeight() == o2.getWeight()) {
            return 0;
        }
        return 1;
    }
}

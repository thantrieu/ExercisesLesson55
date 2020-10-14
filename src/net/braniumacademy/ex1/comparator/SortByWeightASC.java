package net.braniumacademy.ex1.comparator;

import net.braniumacademy.ex1.Animal;

import java.util.Comparator;

public class SortByWeightASC implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        if (o1.getWeight() == o2.getWeight()) {
            return 0;
        }
        return 1;
    }
}

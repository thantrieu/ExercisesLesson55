package net.braniumacademy.ex1.comparator;

import net.braniumacademy.ex1.Animal;

import java.util.Comparator;

// sắp xếp theo chiều cao giảm dần
public class SortByHeightDESC implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o2.getHeight() < o1.getHeight()) {
            return -1;
        }
        if (o2.getHeight() == o1.getHeight()) {
            return 0;
        }
        return 1;
    }
}

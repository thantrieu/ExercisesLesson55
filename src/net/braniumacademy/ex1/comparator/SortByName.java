package net.braniumacademy.ex1.comparator;

import net.braniumacademy.ex1.Animal;

import java.util.Comparator;

// sắp xếp theo tên tăng dần từ a-z
public class SortByName implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

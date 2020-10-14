package net.braniumacademy.ex4.comparator;

import net.braniumacademy.ex4.Smartphone;

import java.util.Comparator;

// sắp xếp theo hãng z-a
public class SortByBrandDESC implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o2.getBrand().compareTo(o1.getBrand());
    }
}

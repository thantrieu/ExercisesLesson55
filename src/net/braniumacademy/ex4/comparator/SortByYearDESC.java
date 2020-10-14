package net.braniumacademy.ex4.comparator;

import net.braniumacademy.ex4.Smartphone;

import java.util.Comparator;

// sắp xếp theo năm giảm dần
public class SortByYearDESC implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o2.getYear() - o1.getYear();
    }
}
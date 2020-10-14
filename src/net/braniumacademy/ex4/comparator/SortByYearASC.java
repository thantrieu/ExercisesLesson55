package net.braniumacademy.ex4.comparator;

import net.braniumacademy.ex4.Smartphone;

import java.util.Comparator;

// sắp xếp theo năm tăng dần
public class SortByYearASC implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getYear() - o2.getYear();
    }
}

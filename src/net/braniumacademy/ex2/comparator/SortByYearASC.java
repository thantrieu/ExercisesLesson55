package net.braniumacademy.ex2.comparator;

import net.braniumacademy.ex2.Vehicle;

import java.util.Comparator;

// sắp xếp theo năm sản xuất từ cũ->mới
public class SortByYearASC implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getYear() - o2.getYear();
    }
}

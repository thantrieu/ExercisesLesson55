package net.braniumacademy.ex3.comparator;

import net.braniumacademy.ex3.Instructor;

import java.util.Comparator;

// sắp xếp giảng viên theo tên a-z
public class SortInstructorByNameASC implements Comparator<Instructor> {
    @Override
    public int compare(Instructor o1, Instructor o2) {
        return o2.getFirstName().compareTo(o1.getFirstName());
    }
}

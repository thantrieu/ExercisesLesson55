package net.braniumacademy.ex3.comparator;

import net.braniumacademy.ex3.Instructor;

import java.util.Comparator;

// sắp xếp giảng viên theo lương giảm dần
public class SortInstructorBySalaryDESC implements Comparator<Instructor> {
    @Override
    public int compare(Instructor o1, Instructor o2) {
        if (o2.getSalary() < o1.getSalary()) {
            return -1;
        }
        if (o2.getSalary() > o1.getSalary()) {
            return 1;
        }
        return 0;
    }
}

package net.braniumacademy.ex5.comparator;

import net.braniumacademy.ex5.Employee;

import java.util.Comparator;

// sắp xếp nhân viên theo tuổi giảm dần
public class SortByAgeDESC implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getDateOfBirth().getTime() < o2.getDateOfBirth().getTime()) {
            return -1;
        }
        if (o1.getDateOfBirth().getTime() > o2.getDateOfBirth().getTime()) {
            return 1;
        }
        return 0;
    }
}

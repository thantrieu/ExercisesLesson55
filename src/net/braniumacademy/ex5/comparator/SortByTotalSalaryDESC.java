package net.braniumacademy.ex5.comparator;

import net.braniumacademy.ex5.Employee;

import java.util.Comparator;

// sắp xếp theo tổng lương giảm dần
public class SortByTotalSalaryDESC implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o2.getTotalSalary() > o1.getTotalSalary()) {
            return 1;
        }
        if (o2.getTotalSalary() < o1.getTotalSalary()) {
            return -1;
        }
        return 0;
    }
}

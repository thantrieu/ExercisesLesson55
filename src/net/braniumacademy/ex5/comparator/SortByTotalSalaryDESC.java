package net.braniumacademy.ex5.comparator;

import net.braniumacademy.ex5.Employee;

import java.util.Comparator;

// sắp xếp theo tổng lương giảm dần
public class SortByTotalSalaryDESC implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        var salaryCompare = Float.compare(o2.getTotalSalary(),
                o1.getTotalSalary());
        if (salaryCompare != 0) {
            return salaryCompare;
        } else {
            var nameCompare = o1.getFullName().getFirst().
                    compareTo(o2.getFullName().getFirst());
            if (nameCompare != 0) {
                return nameCompare;
            } else {
                return o1.getFullName().getLast().
                        compareTo(o2.getFullName().getLast());
            }
        }
    }
}

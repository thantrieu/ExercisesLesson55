package net.braniumacademy.ex3.comparator;

import net.braniumacademy.ex3.Student;

import java.util.Comparator;

// sắp xếp sinh viên theo điểm giảm dần
public class SortStudentByGradeDESC implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getAvgGrade() < o1.getAvgGrade()) {
            return -1;
        }
        if (o2.getAvgGrade() > o1.getAvgGrade()) {
            return 1;
        }
        return 0;
    }
}

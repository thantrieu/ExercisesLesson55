package net.braniumacademy.ex3.comparator;

import net.braniumacademy.ex3.Student;

import java.util.Comparator;

// sắp xếp sinh viên theo tên a-z
public class SortStudentByNameASC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}

package net.braniumacademy.ex3.comparator;

import net.braniumacademy.ex3.Instructor;

import java.util.Comparator;

// sắp xếp giảng viên theo số năm kinh nghiệm giảm dần
public class SortInstructorByExperienceDESC implements Comparator<Instructor> {
    @Override
    public int compare(Instructor o1, Instructor o2) {
        if (o2.getExperience() < o1.getExperience()) {
            return -1;
        }
        if (o2.getExperience() > o1.getExperience()) {
            return 1;
        }
        return 0;
    }
}

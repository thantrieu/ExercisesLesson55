package net.braniumacademy.ex3;

import net.braniumacademy.ex3.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {
        var i1 = new Instructor("INS1002", "Tony Stark", 99000, 6);
        var i2 = new Instructor("INS1001", "Tony Juice", 14000, 3.5f);
        var i3 = new Instructor("INS1005", "Pence Mary", 19000, 5.5f);
        var i4 = new Instructor("INS1009", "Lee Dong", 9000, 1.5f);

        var s1 = new Student("STU100000", "Phan Bá Vành", "CNTT", 6.75f);
        var s2 = new Student("STU100001", "Lê Văn Thiện", "CNTT", 9.5f);
        var s3 = new Student("STU100002", "Phùng Thúy Huyền", "CNTT", 6.75f);
        var s4 = new Student("STU100005", "Đỗ Trọng Anh", "CNTT", 8.5f);

        int choice = 0;
        var input = new Scanner(System.in);
        var instructors = new ArrayList<Instructor>();
        instructors.add(i1);
        instructors.add(i2);
        instructors.add(i3);
        instructors.add(i4);
        var students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        do {
            out.println("===================== MENU =====================");
            out.println("1. Thêm 1 giảng viên vào danh sách");
            out.println("2. Thêm 1 sinh viên vào danh sách");
            out.println("3. Sắp xếp giảng viên theo tên z-a");
            out.println("4. Sắp xếp giảng viên theo mức lương giảm dần");
            out.println("5. Sắp xếp giảng viên theo kinh nghiệm giảm dần");
            out.println("6. Sắp xếp sinh viên theo tên a-z");
            out.println("7. Sắp xếp sinh viên theo điểm trung bình giảm dần");
            out.println("8. Hiển thị danh sách giảng viên ra màn hình");
            out.println("9. Hiển thị danh sách sinh viên ra màn hình");
            out.println("0. Thoát chương trình");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showMessage("Cảm ơn bạn đã sử dụng dịch vụ!");
                    break;
                case 1:
                    Instructor instructor = createInstructor(input);
                    instructors.add(instructor);
                    break;

                case 2:
                    Student student = createStudent(input);
                    students.add(student);
                    break;

                case 3:
                    if (instructors.size() > 0) {
                        Collections.sort(instructors,
                                new SortInstructorByNameASC());
                        showInstructors(instructors);
                    } else {
                        showMessage("Danh giảng viên sách rỗng");
                    }
                    break;
                case 4:
                    if (instructors.size() > 0) {
                        Collections.sort(instructors,
                                new SortInstructorBySalaryDESC());
                        showInstructors(instructors);
                    } else {
                        showMessage("Danh giảng viên sách rỗng");
                    }
                    break;

                case 5:
                    if (instructors.size() > 0) {
                        Collections.sort(instructors,
                                new SortInstructorByExperienceDESC());
                        showInstructors(instructors);
                    } else {
                        showMessage("Danh giảng viên sách rỗng");
                    }
                    break;
                case 6:
                    if (students.size() > 0) {
                        Collections.sort(students);
                        // hoặc:
                        // Collections.sort(students, new SortStudentByNameASC());
                        showStudents(students);
                    } else {
                        showMessage("Danh sách sinh viên rỗng");
                    }
                    break;
                case 7:
                    if (students.size() > 0) {
                        Collections.sort(students, new SortStudentByGradeDESC());
                        showStudents(students);
                    } else {
                        showMessage("Danh sách sinh viên rỗng");
                    }
                    break;
                case 8:
                    if (instructors.size() > 0) {
                        showInstructors(instructors);
                    } else {
                        showMessage("Danh giảng viên sách rỗng");
                    }
                    break;
                case 9:
                    if (students.size() > 0) {
                        showStudents(students);
                    } else {
                        showMessage("Danh sách sinh viên rỗng");
                    }
                    break;
                default:
                    showMessage("Sai chức năng, vui lòng chọn lại!");
                    break;
            }
        } while (choice != 0);
    }

    private static Instructor createInstructor(Scanner input) {
        out.println("Mã giảng viên: ");
        var instructorId = input.nextLine();
        out.println("Tên giảng viên: ");
        var fullName = input.nextLine();
        out.println("Mức lương: ");
        var salary = Float.parseFloat(input.nextLine());
        out.println("Kinh nghiệm: ");
        var exp = Float.parseFloat(input.nextLine());
        return new Instructor(instructorId, fullName, salary, exp);
    }

    private static void showInstructors(ArrayList<Instructor> instructors) {
        out.printf("%-25s%-25s%-15s%-15s\n", "Mã giảng viên",
                "Tên giảng viên", "Mức lương", "Kinh nghiệm");
        for (var instructor : instructors) {
            out.printf("%-25s%-25s%-15.2f%-15.2f\n",
                    instructor.getInstructorId(), instructor.getFullName(),
                    instructor.getSalary(), instructor.getExperience());
        }
    }

    private static void showStudents(ArrayList<Student> students) {
        out.printf("%-25s%-25s%-25s%-15s\n", "Mã sinh viên",
                "Tên sinh viên", "Chuyên ngành", "Điểm TB");
        for (var student : students) {
            out.printf("%-25s%-25s%-25s%-15.2f\n",
                    student.getStudentId(), student.getFullName(),
                    student.getMajor(), student.getAvgGrade());
        }
    }

    private static Student createStudent(Scanner input) {
        out.println("Mã sinh viên: ");
        var id = input.nextLine();
        out.println("Họ tên sinh viên: ");
        var fullName = input.nextLine();
        out.println("Chuyên ngành: ");
        var major = input.nextLine();
        out.println("Điểm trung bình: ");
        var avgGrade = Float.parseFloat(input.nextLine());
        return new Student(id, fullName, major, avgGrade);
    }

    private static void showMessage(String msg) {
        out.println("==> " + msg + " <==");
    }

}

package net.braniumacademy.ex1;

import net.braniumacademy.ex1.comparator.SortByHeightDESC;
import net.braniumacademy.ex1.comparator.SortByName;
import net.braniumacademy.ex1.comparator.SortByWeightASC;
import net.braniumacademy.ex1.comparator.SortByWeightDESC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int choice = 0;
        var input = new Scanner(System.in);
        var animals = new ArrayList<Animal>();
        do {
            System.out.println("=================== MENU ===================");
            System.out.println("1. Thêm 1 động vật vào danh sách");
            System.out.println("2. Hiển thị danh sách động vật ra màn hình");
            System.out.println("3. Sắp xếp động vật theo tên a-z");
            System.out.println("4. Sắp xếp động vật theo chiều cao giảm dần");
            System.out.println("5. Sắp xếp động vật theo cân nặng giảm dần");
            System.out.println("6. Sắp xếp động vật theo cân nặng tăng dần");
            System.out.println("0. Thoát chương trình");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showMessage("Cảm ơn bạn đã sử dụng dịch vụ!");
                    break;
                case 1:
                    Animal animal = createAnimal(input);
                    if(animal == null) {
                        showMessage("Tạo đối tượng thất bại");
                    } else {
                        animals.add(animal);
                        showMessage("Thêm đối tượng thành công");
                    }
                    break;

                case 2:
                    if(animals.size() > 0) {
                        showAnimals(animals);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;

                case 3:
                    if(animals.size() > 0) {
                        Collections.sort(animals, new SortByName());
                        showAnimals(animals);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                case 4:
                    if(animals.size() > 0) {
                        Collections.sort(animals, new SortByHeightDESC());
                        showAnimals(animals);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;

                case 5:
                    if(animals.size() > 0) {
                        Collections.sort(animals, new SortByWeightDESC());
                        showAnimals(animals);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                case 6:
                    if(animals.size() > 0) {
                        Collections.sort(animals, new SortByWeightASC());
                        showAnimals(animals);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                default:
                    showMessage("Sai chức năng, vui lòng chọn lại!");
                    break;
            }
        }while (choice != 0);
    }

    private static void showAnimals(ArrayList<Animal> animals) {
        System.out.printf("%-25s%-20s%-15s%-15s\n", "Tên động vật",
                "Loài động vật", "Chiều cao", "Cân nặng");
        for (var animal : animals             ) {
            System.out.printf("%-25s%-20s%-15.2f%-15.2f\n", animal.getName(),
                    animal.getSpecies(), animal.getHeight(), animal.getWeight());
        }
    }

    private static Animal createAnimal(Scanner input) {
        System.out.println("Chọn loài: \n1. Cá.\n2. Chim.\n3. Động vật có vú");
        var option = Integer.parseInt(input.nextLine());
        System.out.println("Tên động vật: ");
        var name = input.nextLine();
        System.out.println("Giống loài: ");
        var species = input.nextLine();
        System.out.println("Chiều cao: ");
        var height = Float.parseFloat(input.nextLine());
        System.out.println("Cân nặng: ");
        var weight = Float.parseFloat(input.nextLine());
        switch (option) {
            case 1:
                return new Fish(name, species, height, weight);
            case 2:
                return new Bird(name, species, height, weight);
            case 3:
                return new Mammal(name, species, height, weight);
            default:
                showMessage("Sai tùy chọn. Vui lòng thực hiện lại");
                break;
        }
        return null;
    }

    private static void showMessage(String msg) {
        System.out.println("==> " + msg + " <==");
    }
}

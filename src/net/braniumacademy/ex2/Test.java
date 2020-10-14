package net.braniumacademy.ex2;

import net.braniumacademy.ex2.comparator.SortByPriceASC;
import net.braniumacademy.ex2.comparator.SortByPriceDESC;
import net.braniumacademy.ex2.comparator.SortByWeightASC;
import net.braniumacademy.ex2.comparator.SortByYearASC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {
        int choice = 0;
        var input = new Scanner(System.in);
        var vehicles = new ArrayList<Vehicle>();
        do {
            out.println("===================== MENU =====================");
            out.println("1. Thêm 1 phương tiện vào danh sách");
            out.println("2. Sắp xếp phương tiện theo năm sản xuất mới-cũ");
            out.println("3. Sắp xếp phương tiện theo giá bán tăng dần");
            out.println("4. Sắp xếp phương tiện theo giá bán giảm dần");
            out.println("5. Sắp xếp phương tiện theo trọng lượng tăng dần");
            out.println("6. Hiển thị danh sách phương tiện ra màn hình");
            out.println("0. Thoát chương trình");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:
                    showMessage("Cảm ơn bạn đã sử dụng dịch vụ!");
                    break;
                case 1:
                    Vehicle vehicle = createVehicle(input);
                    if (vehicle == null) {
                        showMessage("Tạo đối tượng thất bại");
                    } else {
                        vehicles.add(vehicle);
                        showMessage("Thêm đối tượng thành công");
                    }
                    break;

                case 2:
                    if (vehicles.size() > 0) {
                        Collections.sort(vehicles, new SortByYearASC());
                        showVehicles(vehicles);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;

                case 3:
                    if (vehicles.size() > 0) {
                        Collections.sort(vehicles, new SortByPriceASC());
                        showVehicles(vehicles);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                case 4:
                    if (vehicles.size() > 0) {
                        Collections.sort(vehicles, new SortByPriceDESC());
                        showVehicles(vehicles);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;

                case 5:
                    if (vehicles.size() > 0) {
                        Collections.sort(vehicles, new SortByWeightASC());
                        showVehicles(vehicles);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                case 6:
                    if (vehicles.size() > 0) {
                        showVehicles(vehicles);
                    } else {
                        showMessage("Danh sách rỗng");
                    }
                    break;
                default:
                    showMessage("Sai chức năng, vui lòng chọn lại!");
                    break;
            }
        } while (choice != 0);
    }

    private static void showVehicles(ArrayList<Vehicle> vehicles) {
        out.printf("%-25s%-15s%-15s%-15s\n", "Hãng sản xuất",
                "Năm sản xuất", "Giá bán", "Trọng lượng");
        for (var vehicle : vehicles) {
            out.printf("%-25s%-15d%-15.2f%-15.2f\n", vehicle.getBrand(),
                    vehicle.getYear(), vehicle.getPrice(), vehicle.getWeight());
        }
    }

    private static Vehicle createVehicle(Scanner input) {
        out.println("Chọn loài: \n1. Ô tô.\n2. Xe máy.");
        var option = Integer.parseInt(input.nextLine());

        out.println("Hãng: ");
        var brand = input.nextLine();
        out.println("Năm sản xuất: ");
        var year = Integer.parseInt(input.nextLine());
        out.println("Giá bán: ");
        var price = Float.parseFloat(input.nextLine());
        out.println("Trọng lượng: ");
        var weight = Float.parseFloat(input.nextLine());
        switch (option) {
            case 1:
                return new Automobile(brand, year, price, weight);
            case 2:
                return new Motobike(brand, year, price, weight);
            default:
                showMessage("Sai tùy chọn. Vui lòng thực hiện lại");
                break;
        }
        return null;
    }

    private static void showMessage(String msg) {
        out.println("==> " + msg + " <==");
    }
}

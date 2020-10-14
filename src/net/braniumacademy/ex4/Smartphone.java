package net.braniumacademy.ex4;

public class Smartphone implements Comparable<Smartphone> {
    private String id;
    private String brand;
    private String name;
    private float price;
    private int year;
    private String screenSize;

    public Smartphone() {
    }

    public Smartphone(String id, String brand, String name,
                      float price, int year, String screenSize) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.year = year;
        this.screenSize = screenSize;
    }

    // sắp xếp theo mã thiết bị tăng dần
    @Override
    public int compareTo(Smartphone other) {
        return id.compareTo(other.id);
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final float getPrice() {
        return price;
    }

    public final void setPrice(float price) {
        this.price = price;
    }

    public final int getYear() {
        return year;
    }

    public final void setYear(int year) {
        this.year = year;
    }

    public final String getScreenSize() {
        return screenSize;
    }

    public final void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}

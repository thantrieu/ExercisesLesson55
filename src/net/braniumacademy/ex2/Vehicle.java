package net.braniumacademy.ex2;

/**
 * Lớp mô tả phương tiện giao thông
 */
public abstract class Vehicle implements Comparable<Vehicle> {
    private String brand;   // hãng
    private int year;       // năm sản xuất
    private String madeIn;  // nơi sản xuất
    private float price;    // giá
    private String size;    // kích thước
    private float weight;   // trọng lượng
    private String lisensePlate; // biển số

    public Vehicle() {
    }

    public Vehicle(String brand, int year, String madeIn,
                   float price, String size, float weight,
                   String lisensePlate) {
        this.brand = brand;
        this.year = year;
        this.madeIn = madeIn;
        this.price = price;
        this.size = size;
        this.weight = weight;
        this.lisensePlate = lisensePlate;
    }

    // phương thức sắp xếp theo tên hãng a-z
    @Override
    public int compareTo(Vehicle other) {
        return brand.compareTo(other.brand);
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final int getYear() {
        return year;
    }

    public final void setYear(int year) {
        this.year = year;
    }

    public final String getMadeIn() {
        return madeIn;
    }

    public final void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public final float getPrice() {
        return price;
    }

    public final void setPrice(float price) {
        this.price = price;
    }

    public final String getSize() {
        return size;
    }

    public final void setSize(String size) {
        this.size = size;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final String getLisensePlate() {
        return lisensePlate;
    }

    public final void setLisensePlate(String lisensePlate) {
        this.lisensePlate = lisensePlate;
    }

    // các hành động là abstract methods:
    public abstract void startEngine(); // khởi động

    public abstract void stopEngine(); // tắt máy

    public abstract void speedUp(); // tăng tốc

    public abstract void brake(); // phanh

    public abstract void turnLight(); // bật đèn
}

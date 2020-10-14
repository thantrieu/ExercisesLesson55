package net.braniumacademy.ex4;

public class Circle extends Shape {
    private float radius; // bán kính
    private int centerX;
    private int centerY;

    public Circle() {

    }

    public Circle(String name) {
        setName(name);
    }

    @Override
    protected void draw() {
        System.out.println("Vẽ đường tròn bla bla");
    }

    @Override
    protected void resize() {
        System.out.println("Thay đổi kích thước đường tròn bla bla");
    }

    public final float getRadius() {
        return radius;
    }

    public final void setRadius(float radius) {
        this.radius = radius;
    }

    public final int getCenterX() {
        return centerX;
    }

    public final void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public final int getCenterY() {
        return centerY;
    }

    public final void setCenterY(int centerY) {
        this.centerY = centerY;
    }
}

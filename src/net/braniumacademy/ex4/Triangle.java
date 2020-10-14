package net.braniumacademy.ex4;

public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

    public Triangle() {
    }

    public Triangle(String name) {
        setName(name);
    }

    @Override
    protected void draw() {
        System.out.println("Vẽ tam giác bla bla");
    }

    @Override
    protected void resize() {
        System.out.println("Thay đổi kích thước tam giác bla bla");
    }

    public final float getA() {
        return a;
    }

    public final void setA(float a) {
        this.a = a;
    }

    public final float getB() {
        return b;
    }

    public final void setB(float b) {
        this.b = b;
    }

    public final float getC() {
        return c;
    }

    public final void setC(float c) {
        this.c = c;
    }
}

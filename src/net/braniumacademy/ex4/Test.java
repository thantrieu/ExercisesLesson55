package net.braniumacademy.ex4;

public class Test {
    public static void main(String[] args) {
        Shape triangle = new Triangle("Tam giác");
        triangle.draw();
        triangle.resize();
        System.out.println("=======================");
        Shape circle = new Circle("Đường tròn");
        circle.draw();
        circle.resize();
    }
}

package net.braniumacademy.ex4;

public abstract class Shape {
    private String name;
    private int x;
    private int y;

    protected abstract void draw();

    protected abstract void resize();

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final int getX() {
        return x;
    }

    public final void setX(int x) {
        this.x = x;
    }

    public final int getY() {
        return y;
    }

    public final void setY(int y) {
        this.y = y;
    }
}

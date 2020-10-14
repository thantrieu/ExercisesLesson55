package net.braniumacademy.ex1;

public class Mammal extends Animal {
    private int numOfLeg;
    private String color;
    private int numOfTeeth;
    private String behavior;

    public Mammal() {
    }

    public Mammal(String name, String species, float height, float weight) {
        super(name, species, height, weight);
    }

    public Mammal(int numOfLeg, String color,
                  int numOfTeeth, String behavior) {
        this.numOfLeg = numOfLeg;
        this.color = color;
        this.numOfTeeth = numOfTeeth;
        this.behavior = behavior;
    }

    public Mammal(String name, String species, float height,
                  float weight, String habitat, String birthForm,
                  int numOfLeg, String color, int numOfTeeth, String behavior) {
        super(name, species, height, weight, habitat, birthForm);
        this.numOfLeg = numOfLeg;
        this.color = color;
        this.numOfTeeth = numOfTeeth;
        this.behavior = behavior;
    }

    public void makeFood() {
        System.out.println(getName() + " đang làm món ăn...");
    }

    public final int getNumOfLeg() {
        return numOfLeg;
    }

    public final void setNumOfLeg(int numOfLeg) {
        this.numOfLeg = numOfLeg;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final int getNumOfTeeth() {
        return numOfTeeth;
    }

    public final void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
    }

    public final String getBehavior() {
        return behavior;
    }

    public final void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    // override các phương thức của lớp cha

    @Override
    public void eat() {
        System.out.println("Override lại phương thức eat() trong lớp Mammal");
    }

    @Override
    public void sleep() {
        System.out.println("Override lại phương thức sleep() trong lớp Mammal");
    }

    @Override
    public void move() {
        System.out.println("Override lại phương thức move() trong lớp Mammal");
    }

    @Override
    public void relax() {
        System.out.println("Override lại phương thức relax() trong lớp Mammal");
    }
}

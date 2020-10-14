package net.braniumacademy.ex1;

public abstract class Animal {
    private String name;        // tên
    private String species;     // loài
    private float height;       // chiều cao
    private float weight;       // cân nặng
    private String habitat;     // môi trường sống
    private String birthForm;   // hình thức sinh sản

    public Animal() {
    }

    public Animal(String name, String species, float height,
                  float weight) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
    }

    public Animal(String name, String species, float height,
                  float weight, String habitat, String birthForm) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.habitat = habitat;
        this.birthForm = birthForm;
    }

    // các hành động của động vật:
    protected abstract void eat();

    protected abstract void sleep();

    protected abstract void move();

    protected abstract void relax();

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getSpecies() {
        return species;
    }

    public final void setSpecies(String species) {
        this.species = species;
    }

    public final float getHeight() {
        return height;
    }

    public final void setHeight(float height) {
        this.height = height;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public final String getBirthForm() {
        return birthForm;
    }

    public final void setBirthForm(String birthForm) {
        this.birthForm = birthForm;
    }
}

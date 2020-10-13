package net.braniumacademy.ex1;

public abstract class Animal implements AnimalAction {
    private String name;
    private int age;
    private float weight;
    private String favFood;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, float weight, String favFood) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.favFood = favFood;
    }

    @Override
    public void move() {
        System.out.println("Động vật đang di chuyển...");
    }

    @Override
    public void sleep() {
        System.out.println("Động vật đang ngủ...");
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final String getFavFood() {
        return favFood;
    }

    public final void setFavFood(String favFood) {
        this.favFood = favFood;
    }
}

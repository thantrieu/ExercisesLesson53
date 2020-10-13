package net.braniumacademy.ex1;

public class Dog extends Animal {
    private String color;
    private String species;
    private String petName;

    public Dog() {
    }

    public Dog(String petName) {
        this.petName = petName;
    }

    public Dog(String name, String petName) {
        super(name);
        this.petName = petName;
    }

    @Override
    public void eat(String food) {
        System.out.println("Chó " + petName + " đang ăn món " + food);
    }

    @Override
    public void giveBirth() {
        System.out.println("Chó là động vật đẻ con");
    }

    @Override
    public void move() {
        System.out.println("Chó " + petName + " di chuyển bằng 4 chân trên mặt đất");
    }

    @Override
    public void sleep() {
        System.out.println("Chó " + petName + " ngủ trong lốp ô tô ở góc nhà");
    }

    public void bark() { // sủa
        System.out.println("Chó " + petName + " sủa óc óc...");
    }

    public void wagTail() { // vẫy đuôi
        System.out.println("Chó " + petName + " vẫy đuôi ngoe nguẩy...");
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getSpecies() {
        return species;
    }

    public final void setSpecies(String species) {
        this.species = species;
    }

    public final String getPetName() {
        return petName;
    }

    public final void setPetName(String petName) {
        this.petName = petName;
    }
}

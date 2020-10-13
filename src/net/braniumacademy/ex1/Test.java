package net.braniumacademy.ex1;

public class Test {
    public static void main(String[] args) {
        Dog bob = new Dog("Bob");
        bob.setColor("Yellow");
        System.out.println("Tên của chó là: " + bob.getPetName());
        bob.move();
        bob.bark();
        bob.eat("Fish");
        bob.wagTail();
        bob.sleep();
    }
}

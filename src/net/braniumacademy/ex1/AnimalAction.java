package net.braniumacademy.ex1;

public interface AnimalAction {
    void eat(String food); // ăn

    void sleep(); // ngủ

    void move(); // di chuyển

    void giveBirth(); // sinh đẻ(động vật đẻ con)

    default void speak(String other) { // động vật nói chuyện
        System.out.println("Động vật đang nói chuyện với " + other);
    }

    default void bask() { // hình thức tắm của động vật
        System.out.println("Động vật đang tắm nắng");
    }
}

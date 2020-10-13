package net.braniumacademy.ex3;

public interface Functionality {
    void turnOff(boolean activated); // tắt máy

    void turnOn(boolean activated); // mở máy

    void restart(boolean activated); // khởi động lại

    void offScreen(boolean activated); // tắt màn hình

    void changeVolume(int amount); // thay đổi âm lượng

    void changeBrightness(int amount); // thay đổi độ sáng màn hình

    void connectPeripheral(String peripheral); // kết nối thiết bị ngoại vi
}

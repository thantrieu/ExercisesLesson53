package net.braniumacademy.ex2;

public interface VehicleAction {
    void startEngine(); // khởi động

    void stopEngine(); // tắt máy

    void brake(); // phanh

    void accelarate(float amount); // tăng tốc

    void turnLight(boolean state); // tắt đèn/bật đèn
}

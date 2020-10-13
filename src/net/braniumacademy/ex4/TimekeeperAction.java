package net.braniumacademy.ex4;

public interface TimekeeperAction {
    void readFingerprint(); // đọc vân tay

    void faceScanning(); // quét khuôn mặt

    void identify();  // nhận diện

    void checkin(); // chốt giờ vào

    void checkout(); // chốt giờ ra

    void restart(boolean activated); // khởi động lại

    void turnOff(boolean activated); // tắt nguồn

    void sleep(boolean activated); // ngủ

    void pushNotification(String notice); // thông báo
}

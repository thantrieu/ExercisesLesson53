package net.braniumacademy.ex4;

public class Timekeeper implements TimekeeperAction {
    @Override
    public void readFingerprint() {
        System.out.println("Máy chấm công đang đọc vân tay...");
    }

    @Override
    public void faceScanning() {
        System.out.println("Máy chấm công đang quét khuôn mặt...");
    }

    @Override
    public void identify() {
        System.out.println("Máy chấm công đang tiến hành nhận diện nhân viên...");
    }

    @Override
    public void checkin() {
        System.out.println("Máy chấm công chốt giờ vào cho nhân viên...");
    }

    @Override
    public void checkout() {
        System.out.println("Máy chấm công chốt giờ ra cho nhân viên...");
    }

    @Override
    public void restart(boolean activated) {
        var msg = activated ? "kích hoạt" : "hủy bỏ";
        System.out.println("Máy chấm công " + msg + " chế độ khởi động lại");
    }

    @Override
    public void turnOff(boolean activated) {
        var msg = activated ? "kích hoạt" : "hủy bỏ";
        System.out.println("Máy chấm công " + msg + " chế độ tắt nguồn...");
    }

    @Override
    public void sleep(boolean activated) {
        var msg = activated ? "kích hoạt" : "hủy bỏ";
        System.out.println("Máy chấm công " + msg + " chế độ ngủ");
    }

    @Override
    public void pushNotification(String notice) {
        System.out.println("Máy chấm công hiển thị thông báo chấm công \""
                + notice + "\" lên màn hình...");
    }
}

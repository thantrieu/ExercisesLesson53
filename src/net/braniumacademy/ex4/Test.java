package net.braniumacademy.ex4;

public class Test {
    public static void main(String[] args) {
        Timekeeper timekeeper = new Timekeeper();
        timekeeper.restart(true);
        timekeeper.readFingerprint();
        timekeeper.checkin();
        timekeeper.pushNotification("Xin cảm ơn");
        timekeeper.sleep(true);
        timekeeper.readFingerprint();
        timekeeper.checkout();
        timekeeper.pushNotification("Tạm biệt");
        timekeeper.turnOff(true);
    }
}

package net.braniumacademy.ex3;

public abstract class Smartphone implements Functionality {
    private String brand; // hãng
    private String serialNumber; // số serial
    private String name; // tên
    private float weight; // khối lượng
    private int bateryCapacity; // dung lượng pin
    private String screenSize; // kích thước màn hình

    @Override
    public void turnOff(boolean activated) {
        var message = activated ? "kích hoạt" : "hủy bỏ";
        System.out.println("Smartphone đã " + message + " chức năng tắt máy");
    }

    @Override
    public void turnOn(boolean activated) {
        var message = activated ? "kích hoạt" : "hủy bỏ";
        System.out.println("Smartphone đã " + message + " chức năng mở máy");
    }

    @Override
    public void restart(boolean activated) {
        var message = activated ? "kích hoạt" : "hủy bỏ";
        System.out.println("Smartphone đã " + message + " chức năng khởi động lại");
    }

    public void unlock(String method) {
        System.out.println("Smartphone mở khóa bằng mật khẩu và " + method);
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final String getSerialNumber() {
        return serialNumber;
    }

    public final void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final int getBateryCapacity() {
        return bateryCapacity;
    }

    public final void setBateryCapacity(int bateryCapacity) {
        this.bateryCapacity = bateryCapacity;
    }

    public final String getScreenSize() {
        return screenSize;
    }

    public final void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}

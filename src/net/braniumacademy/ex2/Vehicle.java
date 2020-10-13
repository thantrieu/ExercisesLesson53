package net.braniumacademy.ex2;

public abstract class Vehicle implements VehicleAction {
    private String brand;
    private String name;
    private String year;
    private float price;
    private float weight;

    @Override
    public void accelarate(float amount) {
        System.out.println("Phương tiện giao thông đang tăng tốc");
    }

    @Override
    public void startEngine() {
        System.out.println("Phương tiện giao thông đang khởi động");
    }

    @Override
    public void turnLight(boolean state) {
        var light = (state) ? "Bật đèn" : "Tắt đèn";
        System.out.println("Phương tiện giao thông đang " + light);
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getYear() {
        return year;
    }

    public final void setYear(String year) {
        this.year = year;
    }

    public final float getPrice() {
        return price;
    }

    public final void setPrice(float price) {
        this.price = price;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }
}

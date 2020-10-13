package net.braniumacademy.ex2;

import java.util.Date;

public class Car extends Vehicle {
    private Owner owner;
    private String licensePlate; // biển số
    private int numOfSeat;
    private String engineType;
    private String engineNumber; // số máy
    private String chassisNumber; // số khung
    private Date registerDate; // ngày đăng kí

    @Override
    public void startEngine() {
        System.out.println("Xe con đang khởi động...");
    }

    @Override
    public void turnLight(boolean state) {
        if (state) {
            System.out.println("Xe con đang bật đèn");
        } else {
            System.out.println("Xe con đã tắt đèn");
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("Xe con khởi động bằng điện");
    }

    @Override
    public void brake() {
        System.out.println("Xe con đang phanh cháy lốp trên đường");
    }

    @Override
    public void accelarate(float amount) {
        System.out.println("Xe " + getName() + " đang tăng tốc brum brum...");
    }

    public void wipe() {
        System.out.println("Cần gạt nước xe " + getName() + " đang hoạt động");
    }

    public final Owner getOwner() {
        return owner;
    }

    public final void setOwner(Owner owner) {
        this.owner = owner;
    }

    public final String getLicensePlate() {
        return licensePlate;
    }

    public final void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public final int getNumOfSeat() {
        return numOfSeat;
    }

    public final void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public final String getEngineType() {
        return engineType;
    }

    public final void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public final String getEngineNumber() {
        return engineNumber;
    }

    public final void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public final String getChassisNumber() {
        return chassisNumber;
    }

    public final void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public final Date getRegisterDate() {
        return registerDate;
    }

    public final void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    class Owner {
        private String firstName;
        private String lastName;
        private String midName;
        private Date dateOfBirth;

        public Owner(String firstName) {
            this.firstName = firstName;
        }

        public final String getFirstName() {
            return firstName;
        }

        public final void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public final String getLastName() {
            return lastName;
        }

        public final void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public final String getMidName() {
            return midName;
        }

        public final void setMidName(String midName) {
            this.midName = midName;
        }

        public final Date getDateOfBirth() {
            return dateOfBirth;
        }

        public final void setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
    }

}

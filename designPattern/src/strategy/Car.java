package strategy;

public class Car {
    private DrivingStat drivingStat;

    public Car(DrivingStat drivingStat) {
        this.drivingStat = drivingStat;
    }

    public void drive() {
        drivingStat.Drive();
    }
}

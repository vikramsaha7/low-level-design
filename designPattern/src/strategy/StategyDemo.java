package strategy;

public class StategyDemo {
    public static void main(String[] args) {
       Car sportCar = new Car(new SportDriving());
       sportCar.drive();
       Car normalCar = new Car(new NormalDriving());
       normalCar.drive();
    }
}

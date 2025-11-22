package strategy;

public class NormalDriving  implements DrivingStat {
    @Override
    public void Drive() {
        System.out.println("Driving in normal mode.");
    }
}

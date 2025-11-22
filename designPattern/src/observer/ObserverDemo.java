package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        System.out.println("Observer Pattern Demo");
        Obserable obserable = new ObserableImpl();
        Observer observer1 = new ObserverImpl(obserable,"Observer 1");
        Observer observer2 = new ObserverImpl(obserable,"Observer 2");

        obserable.registerObserver(observer1);
        obserable.registerObserver(observer2);
        obserable.setChanged(true);

    }
}


package observer;

public class ObserverImpl implements Observer {
    Obserable ob;
    String name;

    public ObserverImpl(Obserable ob, String s) {
        this.ob = ob;
        this.name = s;
    }

    @Override
    public void update() {
        System.out.println("Notified " + name);
        System.out.println(ob.toString());
    }
}

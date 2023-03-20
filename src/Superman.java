public class Superman implements CanRun, CanFly, CanSwim {
    String name;

    public Superman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("Superman" + getName() + "can fly");

    }

    @Override
    public void run() {
        System.out.println("Superman" + getName() + "can run");

    }

    @Override
    public void swim() {
        System.out.println("Superman" + getName() + "can swim");
    }
}

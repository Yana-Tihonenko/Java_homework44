public class Duck implements CanFly, CanSwim {
    @Override
    public void fly() {
        System.out.println("Duck can fly");

    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}

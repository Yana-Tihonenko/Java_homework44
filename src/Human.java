public class Human implements CanRun, CanSwim {

    @Override
    public void run() {
        System.out.println("Human can run");

    }

    @Override
    public void swim() {
        System.out.println("Human can swim");
    }
}

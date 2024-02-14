package core.machines;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck starts working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck is finished working!");
    }
}

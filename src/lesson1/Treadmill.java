package lesson1;

public class Treadmill extends Course {
    public Treadmill(int length) {
        super(length);
    }

    public int getTimeToOvercomeTreadmill(CanRun runner) {
        return runner.run(this);
    }
}
package lesson1;

public class Wolf extends Animal implements CanSwim, CanRun {
    private int swimmingSpeed;
    private int runningSpeed;
    public Wolf(String name, String color, int age, int swimmingSpeed, int runningSpeed) {
        super(name, color, age);
        this.swimmingSpeed = swimmingSpeed;
        this.runningSpeed = runningSpeed;

    }
    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public int getRunningSpeed() {
        return runningSpeed;
    }

    public String toString (){
        return "\n Wolf's name is " + name + ", color " + color + ", age " + age;
    }

    @Override
    public int swim(Pool pool) {
        int timeToOvercome = pool.getLength() / getSwimmingSpeed();
        System.out.println("Животное проплыло дорожку за " + timeToOvercome + " секунд");
        return timeToOvercome ;
    }

    @Override
    public int run(Treadmill treadmill) {
        int timeToOvercome = treadmill.getLength() / getRunningSpeed();
        System.out.println("Животное пробежало дорожку за " + timeToOvercome + " секунд");
        return timeToOvercome;
    }
}

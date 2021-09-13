package lesson1;

public class Cat extends Animal implements CanRun {
    private int runningSpeed;
    public Cat (String name, String color, int age, int runningSpeed){
        super(name, color, age);
        this.runningSpeed = runningSpeed;

    }
    public int getRunningSpeed() {
        return runningSpeed;
    }

    public String toString(){ return "Cat's name is " + name + ", color "
            + color + ", age " + age;
    }

    @Override
    public int run(Treadmill treadmill) {
        int timeToOvercome = treadmill.getLength() / getRunningSpeed();
        System.out.println("Животное пробежало дорожку за " + timeToOvercome + " секунд");
        return timeToOvercome;
    }
}

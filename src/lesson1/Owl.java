package lesson1;

public class Owl extends Animal implements CanFly{
    private int flyingSpeed;

    public Owl(String name, String color, int age, int flyingSpeed) {
        super(name, color, age);
        this.flyingSpeed = flyingSpeed;
    }

    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public String toString (){
        return "\n Owl's name is " + name + ", color " + color + ", age " + age;
    }

    @Override
    public int fly(Air air) {
        int timeToOvercome = air.getLength() / getFlyingSpeed();
        System.out.println("Животное пролетело дорожку за " + timeToOvercome + " секунд");
        return timeToOvercome;
    }
}

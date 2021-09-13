package lesson1;

public class Air extends Track {
    private int length;
    public Air(int length) {
        super(length);
    }

    public int getTimeToOvercomeAir(CanFly bird) {
        return bird.fly(this);
    }
}

package lesson1;

public class Pool extends Course{

    public Pool(int length) {
        super(length);
    }

    public int getTimeToOvercomePool(CanSwim swimmer) {
        return swimmer.swim(this);
    }


}

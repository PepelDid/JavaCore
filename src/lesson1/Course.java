package lesson1;

public abstract class Course {
    private int length;
    public Course(int length) {
        this.length = length;
    };

    public int getLength() {
        return length;
    };
};
package lesson3;

public abstract class Fruit {
    private int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}

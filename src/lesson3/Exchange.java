package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// осваивала коллекции,они логичные,ими и сделала 1 задание на обмен элементов массива местами

public class Exchange {
    public static void main(String[] args) {
        ArrayList<String> base = new ArrayList<>(Arrays.asList("town", "sister", "pilot", "row", "foot", "like", "velvet"));
        ArrayList<String> change =  new ArrayList<>();
        change.addAll(base);
        Random random = new Random();
        int x= random.nextInt(base.size());
        int y= base.size() - x;
        change.set(x, new String ((base.get(y))));
        change.set(y, new String ((base.get(x))));

        System.out.println(base);
        System.out.println(change);
    }
}

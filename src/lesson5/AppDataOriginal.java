package lesson5;

import java.io.Serializable;
import java.util.Arrays;

// Это я осваивала работу с чтением и записью объектов, и тут у меня все в порядке
//все читается и записывается
public class AppDataOriginal implements Serializable {
    private String[] header;
    private int[] []data;
    public AppDataOriginal(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }
    public String toString() {
        return Arrays.toString(header) +'\n'+ Arrays.deepToString(data);}
}

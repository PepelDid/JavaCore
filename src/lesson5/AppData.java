package lesson5;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[] data;

    public AppData(String[] header, int[] data) {
        this.header = header;
        this.data = data;

    }
    public String toString() {
        return Arrays.toString(header) + Arrays.toString(data);}
}

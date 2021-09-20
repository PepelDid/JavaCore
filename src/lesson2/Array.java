package lesson2;

public class Array {
    public static void main(String[] args) {
    }

    public static void arrayTrans(String[][] arr) {

        Integer k1 = 0;
        int[][] arrTrans = new int[4][4];
        int sum = 0;
        int q = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    k1 = Integer.valueOf(arr[i][j]);
                } catch (NumberFormatException MyArrayDataException) {
                    System.out.println(MyArrayDataException.getLocalizedMessage() + "(array position is " + i + "," + j + ")");
                    q++;
                    //MyArrayDataException.printStackTrace();
                }
                arrTrans[i][j] = k1;
                sum += k1;

            }
        }
        System.out.println("I've found " + q + " problems. Without exceptions this array has sum " + sum);

    }
}
package lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] arr;
        arr = new String[][]{
                {"5", "8", "@", "8"},
                {"7", "8", "word", "5"},
                {"2", "1", "8", "8"},
                {"2", "#$@", "8", "8"},
        };
// я не понимаю,как отлавливать размер массива.Он обрабатывает все массивы,которые я
// ему даю,насколько может.Из массива в 5 строк обрабатывает 4, из массива в 2 строки - 2.
// Но оповещает меня,что у меня с массивом проблема
        if (arr.length > 4) {
            System.out.println( "Wrong array. His 1.parameter is " + arr.length);
        };
        try {
            Array.arrayTrans(arr);
        } catch (ArrayIndexOutOfBoundsException MyArraySizeException) {
            System.out.println("Wrong array. One of his parameters is " + MyArraySizeException.getLocalizedMessage());

        }
    }
}

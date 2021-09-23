package lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadingWriting {
    public static void main(String[] args) {
        ArrayList<AppData> dataList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.cvs"))) {
            String tempData;

            while((tempData = bufferedReader.readLine()) !=null) {
                String[] data;
                String[] headers = new String[3];
                data = tempData.split(";");
                for (int i = 0; i < 3; i++) {
                    headers[i] = data[i];
                }

                // я не понимаю, как управлять ридером,он читает каждую строку заново и применяет к ней все операторы,
                //а мне нужно что-то типа "Прочитай первую строку и положи ее в массив строк, прочитай вторую,трансформируй в числа и положи ее
                //в массив чисел"
                //Я упростила параметр класса AppData с двумерного до обычного массива, чтобы разобраться, но не знаю, в какую логическую структуру
                //положить ридер,чтобы он дифференцировано применял операторы
                ;
                int[] numbers = new int[3];
                data = tempData.split(";");
                for (int i = 0; i < 3; i++) {
                    numbers[i] = Integer.valueOf(data[i]);
                }
                ;
                AppData appdata = new AppData(headers, numbers);
                dataList.add(appdata);
            }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(AppData elem: dataList){
            System.out.println(elem.toString());
        }

    }

}

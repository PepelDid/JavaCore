package lesson5;

import java.io.*;

public class SerializationRW {
    public static void main(String[] args) {
        AppDataOriginal dataAsObject = new AppDataOriginal((new String[]{"V", "V2", "V3"}),(new int[][]{
                {100,200,300},
                {500,600,403},
                {902, 602, 458}
        }));
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data_as_object.cvs"))) {
            objectOutputStream.writeObject(dataAsObject);
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("data_as_object.cvs"))) {
            AppDataOriginal dataFromFile = (AppDataOriginal) objectInputStream.readObject();
            System.out.println(dataFromFile);
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

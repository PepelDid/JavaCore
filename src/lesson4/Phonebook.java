package lesson4;
//Здесь я попыталась использовать для построения телефонной книги HashMap,
//но у меня не получилось доставать из нее однофамильцев, потому что идет перезапись ячейки,если
//ключ-имя совпадает

import java.util.HashMap;

public class Phonebook {
    static HashMap<String, Long> phonebook = new HashMap<>();
    public static void main(String[] args) {
        add("Serov", 89025645651L);
        add("Ivanov", 89015645057L);
        add("Petrov", 89020620658L);
        add("Ivanov", 80000001111L);
        print();
        getNumber("Ivanov");
    }

    public static void print() {
        for(String name : phonebook.keySet()){
            System.out.println(name + " " + phonebook.get(name));
        }
    }

   public static void add(String name, Long number) {
       phonebook.put(name, number);
   }
    public static void getNumber(String name) {
        System.out.println("You're looking for " + name + " " +  phonebook.get(name));
    }
};


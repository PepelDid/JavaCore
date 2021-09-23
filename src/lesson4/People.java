package lesson4;
// Здесь я использовала обычный список,работающий с объектами, он работает с однофамильцами

import java.util.ArrayList;

public class People {
    private String name;
    private Long number;

    public People(String name, Long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getNumber() {
        return number;
    }
    public void setNumber(Long number) {
        this.number = number;
    }

    static ArrayList<People> phonebook = new ArrayList<>();

    public static void main(String[] args) {
        People person1 = new People("Kat", 8902356578L);
        People person2 = new People("Loyd", 3602354771L);
        People person3 = new People("Tom", 3602354444L);
        People person4 = new People("Tom", 4702354222L);

        add(person1);
        add(person2);
        add(person3);
        add(person4);

        findNumber(phonebook, "Tom");

    }
    public static void add(People person){
        phonebook.add(person);
    }
    public static void findNumber(ArrayList phonebook, String name){
        int x = 0;
        for(int i = 0; i< phonebook.size(); i++) {
            People p = (People) phonebook.get(i);
            if(p.getName() == name){
                x++;
                System.out.println(p.getName() + " has number " + p.getNumber());
            }
        }
        System.out.println("I found " + x + " entries");
    }
}

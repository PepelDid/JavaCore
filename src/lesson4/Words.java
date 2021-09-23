package lesson4;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("fun", "jump", "try", "cold",
                "doom", "solid", "fine", "what", "wrong", "song", "list", "doom", "solid",
                "jump", "doom", "jump", "solid"));
        System.out.println(words);

        HashSet<String> wordsHash = new HashSet<>();
        for(String word: words){
            int x= 0;
            for(int i = 0; i < words.size(); i++){
                 if(word == words.get(i)){
                     x++;
                 };
            }
            String s = word + " " + x;
            wordsHash.add(s);
        }
        System.out.println(wordsHash);
    }



}

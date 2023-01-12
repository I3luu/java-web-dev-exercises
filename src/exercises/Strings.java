package exercises;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println(text + "\n word search: ");
        String sentence = text.toLowerCase();
        String search = input.next().toLowerCase();

        if(sentence.contains(search)){
            System.out.println(search + "was found");
            System.out.println(sentence.indexOf(search));
            System.out.println(search.length());
            String newSentence = sentence.replace(search,"");
            System.out.println(newSentence);
        } else {
            System.out.println(search + "was not found");
        }

    }
}

package klasa_string.stringEx;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę wyrazów: ");

        int wordsNumber = input.nextInt();
        input.nextLine();

        String[] words = new String[wordsNumber];

        for (int i = 0; i < wordsNumber; i++) {
            System.out.println("podaj kolejne słowo: ");
            words[i] = input.nextLine();
        }
        System.out.println("wyrazy wpisane do tablicy to: ");
        for (String word : words){
            System.out.println(word);
        }

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < wordsNumber; i++) {
                build.append(words[i].charAt(words[i].length()-1));
        }

        System.out.println("Nowe słowo złożone z " + words.length + " to: " + build );
        input.close();
    }
}

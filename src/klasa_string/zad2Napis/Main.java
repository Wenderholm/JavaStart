package klasa_string.zad2Napis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String text = readTextFromUser();
       text = changeTextToUpperOrLowerCase(text);
        System.out.println("tekst po transformacji ");
        System.out.println(text);
    }

    private static String changeTextToUpperOrLowerCase(String text){
        char firstChar = text.charAt(0);
        if(Character.isUpperCase(firstChar)) {
            text = text.toLowerCase();
        }else{
            text = text.toUpperCase();
        }
        return text;
    }

    private static String readTextFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz dowolny tekst: ");
        return  sc.nextLine();
    }
}

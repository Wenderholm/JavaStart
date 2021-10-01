package wprowadzenie_danych_wyjątki.zad2_Rzut_moneta;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        int awers = 1;
        int rewers = 0;
        System.out.println("wybierz jedną z dostępnych opcji:");
        System.out.println( awers + " - orzeł");
        System.out.println( rewers + " - reszka");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userChoice = scanner.nextInt();
        int compChoice = random.nextInt(2);
        System.out.println("twój wybór to : "+ userChoice);

        if(userChoice == compChoice){
            if(compChoice == awers)
                System.out.println("Brawo wypadł orzeł i wygrywasz");
            if(compChoice == rewers)
                System.out.println("Brawo wypadła reszka i wygrywasz");
        }else
            System.out.println("niestety żle wybrałeś");
    }
}

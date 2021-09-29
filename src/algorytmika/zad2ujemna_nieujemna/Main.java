package algorytmika.zad2ujemna_nieujemna;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int index = 0;
        int multi = 1;
        int next = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        next = scanner.nextInt();

        while(index < 5 ){
            next = scanner.nextInt();
            multi *= next;
            index++;
        }
        if(multi>=0)
            System.out.println("nieujemna");
        else
            System.out.println("ujemna");
    }
}

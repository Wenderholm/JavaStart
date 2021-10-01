package enumTraining.zad1pizza;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze do wyboru: ");
        for(Pizza p : Pizza.values()){
            System.out.println(p);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Jaką wybierasz pizze: ");
        Pizza pizza = Pizza.valueOf(input.nextLine());

        System.out.println("dziekujemy za zamówienie pizzy " + pizza.name());
        input.close();
    }
}

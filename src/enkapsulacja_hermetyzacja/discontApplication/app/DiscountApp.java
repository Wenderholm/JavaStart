package enkapsulacja_hermetyzacja.discontApplication.app;

import enkapsulacja_hermetyzacja.discontApplication.services.DiscountService;
import enkapsulacja_hermetyzacja.discontApplication.data.Client;
import enkapsulacja_hermetyzacja.discontApplication.services.PrintService;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client(null, "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        PrintService printService = new PrintService();
        printService.printAllInformation(client1,price1,priceDiscount1);
        printService.printAllInformation(client2,price2,priceDiscount2);

//          stary sopsób
//        System.out.println("Witaj " + client1.getFirstName() + " " + client1.getLastName());
//        System.out.println("Kwota przed rabatem: " + price1);
//        System.out.println("Do zapłaty (po rabacie): " + priceDiscount1);
//
//        System.out.println("Witaj " + client2.getFirstName() + " " + client2.getLastName());
//        System.out.println("Kwota przed rabatem: " + price2);
//        System.out.println("Do zapłaty (po rabacie): " + priceDiscount2);
    }
}

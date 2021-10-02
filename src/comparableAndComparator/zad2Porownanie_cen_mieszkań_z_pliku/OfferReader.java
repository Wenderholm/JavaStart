package comparableAndComparator.zad2Porownanie_cen_mieszkań_z_pliku;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OfferReader  {
    private static final int OFFERS_NUM = 10;


    static Offer[] readOffers(String fileName) throws FileNotFoundException {
        Offer[] offers = new Offer[10];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            for (int i = 0; i < OFFERS_NUM; i++) {
                offers[i] = createOffer(scanner.nextLine());
            }
        }
        return offers;
    }

    private static Offer createOffer(String nextLine) {
        String[] data = nextLine.split(";");
        return new Offer(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]));
    }
}

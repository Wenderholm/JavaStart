package enkapsulacja_hermetyzacja.discontApplication.services;

import enkapsulacja_hermetyzacja.discontApplication.data.Client;

public class PrintService {
    public void printAllInformation(Client client, double oldPrice, double newPrice){
        printWelcomeMessage(client);
        printPrice(oldPrice, newPrice);
        System.out.println("-------------------------------------------------------");

    }

    private void printPrice(double oldPrice, double newPrice) {
        System.out.println("Cena przed obizka: "+ oldPrice);
        System.out.println("Cena po obizce: "+ newPrice);
    }

    private void printWelcomeMessage(Client client) {
        String firstName = client.getFirstName();
        String lastName = client.getLastName();

        if (firstName != null && lastName == null){
            System.out.println("Witaj " + firstName);
        } else if(  firstName != null && lastName != null ){
            System.out.println("Witaj " + firstName + " " + lastName);
        } else if (firstName == null && lastName != null){
            System.out.println("Dzień dobry panie/pani Kowalski");
        } else {
            System.out.println("Dzien dobry nieznajomy");
        }
    }
}

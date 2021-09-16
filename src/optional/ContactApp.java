package optional;

import java.util.List;
import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        ContactReader.readFile("contacts.csv")
                .ifPresentOrElse(ContactApp::findByEmail, ContactApp::fileNotFoundMessage);
        ContactReader.readFile("contacts.csv")
                .ifPresentOrElse(ContactApp::findByLastName, ContactApp::contactNotFoundMessage);

    }

    private static void findByEmail(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        contactManager.findByEmail(email)
                .ifPresentOrElse(ContactApp::showShortInfo, ContactApp::contactNotFoundMessage);
    }

    private static void findByLastName(ContactManager contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nazwisko :");
        String textFragment = scanner.nextLine();
        List<Contact> byLastName = contactManager.findByLastName(textFragment);
        for (Contact contact : byLastName) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName());
        }



    }


    private static void showShortInfo(Contact contactByEmail) {
        System.out.println("Kontakt o wskazanym adresie email:");
        System.out.println(contactByEmail.getShortInfo());
    }

    private static void fileNotFoundMessage(){
        System.out.println("Brak pliku z danymi");
    }

    private static void contactNotFoundMessage(){
        System.out.println("brak kontaktu o wskazanym adresie");
    }
}
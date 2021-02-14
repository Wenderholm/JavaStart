package agregacje_kompozycje_bank;

public class Bank {
    public static void main(String[] args) {

//        Person person1 = new Person("Jan","Nowak", "8803050403");
////        inny sposób przypisania do person 1 bez konstruktora
////        person1.firstName = "Jan";
////        person1.lastName = "Nowak";
////        person1.pesel = "8803050403";
//
//        BankAccount account1 = new BankAccount(person1, 10_000);
////        account1.owner = person1;
////        account1.balance = 10_000;
//
//        Credit credit1 = new Credit(person1, 5_000,0,0.10,12);
////        credit1.borrower = person1;
////        credit1.cashBorrowed = 5_000;
////        credit1.cashReturned = 0;
////        credit1.interestRate = 0.10;
////        credit1.termMonths = 12;
//
//        System.out.println("Osoba:");
//        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
//        System.out.println("posiada konto bankowe: " + account1.balance);
//        System.out.println("posiada kredyt w wysokości: " + credit1.cashBorrowed);

//    ZADANIE 1
        Person person1 = new Person("Jan","Nowak", "8803050403");
        Adress address1 = new Adress("Brodnica","Nowa", 10,5,"87-300");
        person1.livingAddress = address1;
        person1.registerAddress = address1;
        BankAccount account1 = new BankAccount(person1, 10_000);

        Person person2 = new Person("Adam","Rupinski", "9012050413");
        Adress address2 = new Adress("Nowe Miasto","Długa", 12,15,"81-100");
        person2.livingAddress = address1;
        person2.registerAddress = address2;
        BankAccount account2 = new BankAccount(person2, 15_000);

        System.out.println("Osoba 1:");
        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("mieszka w miejscowości: " + person1.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);

        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("mieszka w miejscowości: " + person2.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);

    }
}

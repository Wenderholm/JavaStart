package agregacje_kompozycje.bank;

public class Person {
    String firstName;
    String lastName;
    String pesel;
    Adress registerAddress;
    Adress livingAddress;

    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }
}

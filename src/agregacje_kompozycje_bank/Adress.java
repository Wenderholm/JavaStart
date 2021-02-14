package agregacje_kompozycje_bank;

public class Adress {
    String city;
    String street;
    int home;
    int flat;
    String postalCode;

    public Adress(String city, String street, int home, int flat, String postalCode) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.flat = flat;
        this.postalCode = postalCode;
    }
}

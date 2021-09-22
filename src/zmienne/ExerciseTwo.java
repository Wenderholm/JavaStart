package zmienne;

public class ExerciseTwo {
    public static void main(String[] args) {
        double price = 100;
        double vat = 0.23;
        double podatek = price * vat;
        double brutto = price + podatek;

        System.out.println("cena netto wynosi: " + price);
        System.out.println("cena brutto wynosi: " + brutto);
        System.out.println("podatek wynosi: " + podatek);
    }
}

package metody_konstruktory;

public class Calculate {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double x = 15;
        double y = 20;
        System.out.println("wynik dodawania to: " + calc.add(x,y));
        System.out.println("wynik odejmowania to: " + calc.substract(x,y));
        System.out.println("wynik mnozenia to: " + calc.multiply(x,y));
        System.out.println("wynik dzielenia to: " + calc.divide(x,y));
    }
}

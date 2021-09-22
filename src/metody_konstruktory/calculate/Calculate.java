package metody_konstruktory.calculate;

public class Calculate {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Double x = 15.0;
        Double y = 20.0;
        Double z = 15.0;
        System.out.println("wynik dodawania to: " + calc.add(x,y));
        System.out.println("wynik odejmowania to: " + calc.substract(x,y));
        System.out.println("wynik mnozenia to: " + calc.multiply(x,y));
        System.out.println("wynik dzielenia to: " + calc.divide(x,y));

        System.out.println("dodawanie trzech liczb: " + calc.add(x,y,z));
        System.out.println("odejmowanie trzech liczb: " + calc.substract(x,y,z));
    }
}

package metody_konstruktory.symulacja_rzutu_kostka;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice(1);
        dice.printInfo();
        dice.roll();
        dice.printInfo();
        dice.roll();
        dice.printInfo();
    }
}

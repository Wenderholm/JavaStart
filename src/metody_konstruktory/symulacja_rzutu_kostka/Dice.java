package metody_konstruktory.symulacja_rzutu_kostka;

import java.util.Random;

public class Dice {
    Random mix = new Random();
    int top;

    public Dice(int top) {
        this.top = top;
    }

    public Dice() {
        roll();
    }

    public void roll() {
        top = mix.nextInt(6)+1;
    }

    void printInfo(){
        System.out.println("na kostce wypadło: " + top);
    }
}

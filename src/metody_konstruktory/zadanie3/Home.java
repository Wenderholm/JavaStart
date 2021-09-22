package metody_konstruktory.zadanie3;

public class Home {
    double water;
    double fuel;

    public Home(double water, double fuel) {
        this.water = water;
        this.fuel = fuel;
    }

    void takeShower(){
        water -= 48;
    }

    void takeBath() {
        water = water - 86;
    }

    void makeDinner() {
        water = water - 4;
        fuel = fuel - 0.1;
    }

    void boilWater() {
        water = water - 0.5;
        fuel = fuel - 0.05;
    }

    void watchTv(int hours) {
        double fuelConsumption = hours * 0.06;
        fuel = fuel - fuelConsumption;
    }

    String getStatus() {
        return "Ilość wody = " + water + ", Ilość paliwa = " + fuel;
    }
}

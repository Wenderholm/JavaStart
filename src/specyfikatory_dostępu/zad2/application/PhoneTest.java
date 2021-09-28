package specyfikatory_dostępu.zad2.application;

import specyfikatory_dostępu.zad2.logic.Charger;
import specyfikatory_dostępu.zad2.model.Telephone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.getBrand()
                + " " + telephone.getModel()
                + ", bateria: " + telephone.getBatteryCapacity() +"mAh"
                + ", poziom naładowania: " + telephone.getChargeLevel() + "%");

        Charger charger = new Charger();
        charger.loadBattery(telephone);
        charger.loadBattery(telephone);
        charger.loadBattery(telephone);
        charger.loadBattery(telephone);
        charger.loadBattery(telephone);
        System.out.println(telephone.getInfo());

    }
}

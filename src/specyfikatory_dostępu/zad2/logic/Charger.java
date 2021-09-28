package specyfikatory_dostępu.zad2.logic;

import specyfikatory_dostępu.zad2.model.Telephone;

public class Charger {

    public void loadBattery(Telephone telephone){
        int actBatteryLevel = telephone.getChargeLevel();
        telephone.setChargeLevel(actBatteryLevel+1);
        System.out.println("telefon podładowany o 1%");
    }
}

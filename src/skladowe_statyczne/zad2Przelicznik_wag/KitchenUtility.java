package skladowe_statyczne.zad2Przelicznik_wag;

public class KitchenUtility {
    static final double GLASS = 250;
    static final double SPOON = 15;
    static final double TEESPOON = 5;

    static double glassToMl(double glasses){
        return glasses * GLASS;
    }
    static double spoonToMl(double spoon){
        return spoon * SPOON;
    }
    static double teespoonToMl(double teespoon){
        return teespoon * TEESPOON;
    }
}

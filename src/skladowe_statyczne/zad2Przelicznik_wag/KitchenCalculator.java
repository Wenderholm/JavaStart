package skladowe_statyczne.zad2Przelicznik_wag;

public class KitchenCalculator {
    public static void main(String[] args) {
        double waterGlasses = 2;
        double oilSpoons = 2.5;
        double honeyTeaspoons = 4;

        double waterMl = KitchenUtility.glassToMl(waterGlasses);
        double oilMl = KitchenUtility.spoonToMl(oilSpoons);
        double honeyMl = KitchenUtility.teespoonToMl(honeyTeaspoons);

        System.out.println("Do przepisu potrzebujesz:");
        System.out.println(waterGlasses + " szklanki, czyli " + waterMl + "ml wody");
        System.out.println(oilSpoons + " łyżek, czyli " + oilMl + "ml oleju");
        System.out.println(honeyTeaspoons + " łyżeczek, czyli " + honeyMl + "ml miodu");
    }
}

package klasy_obiekty.plantsExerciseTwo;

public class Main {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.name = "Storczyk";
        plant1.description = "Kolorowy kwiat";
        plant1.waterConsumption = 0.1;

        Plant plant2 = new Plant();
        plant2.name = "Fikus";
        plant2.description = "Niskie drzewo";
        plant2.waterConsumption = 0.15;

        Plant plant3 = new Plant();
        plant3.name = "Monstera";
        plant3.description = "Zielona roślina";
        plant3.waterConsumption = 0.3;

        double dailyWaterConsumption = plant1.waterConsumption + plant2.waterConsumption + plant3.waterConsumption;
        double weeklyWaterConsumption = (plant1.waterConsumption + plant2.waterConsumption + plant3.waterConsumption) * 7;
        double yearlyWaterConsumption = (plant1.waterConsumption + plant2.waterConsumption + plant3.waterConsumption) * 365;

        System.out.println("dzienne zużycie wody przez nasze rośliny " + dailyWaterConsumption + "l");
        System.out.println("miesięczne zużycie wody przez nasze rośliny " + weeklyWaterConsumption + "l");
        System.out.println("roczne zużycie wody przez nasze rośliny " + yearlyWaterConsumption + "l");
    }
}

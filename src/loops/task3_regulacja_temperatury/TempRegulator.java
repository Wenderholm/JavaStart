package loops.task3_regulacja_temperatury;

import java.util.Scanner;

public class TempRegulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj aktualną temperaturę: ");
        double actualTemp = scanner.nextInt();
        System.out.println("podaj oczekiwaną temperaturę: ");
        double expectedTemp = scanner.nextInt();

//        if (actualTemp > expectedTemp) {
//            while (actualTemp - expectedTemp != 0) {
//                expectedTemp = expectedTemp + 0.5;
//                System.out.println("aktualna temperatura: " + expectedTemp);
//            }
//        } else {
//            while (expectedTemp - actualTemp != 0) {
//                expectedTemp = expectedTemp - 0.5;
//                System.out.println("aktualna temperatura: " + expectedTemp);
//            }
//        }

        System.out.println("DRUGIE ROZWIĄZANIE");
        while (actualTemp != expectedTemp) {
            System.out.println("Aktualna temperatura: " + actualTemp);
            double temperatureDiff = expectedTemp - actualTemp;
            if (temperatureDiff > 0) {
                actualTemp += 0.5;
            } else if (temperatureDiff < 0) {
                actualTemp -= 0.5;
            }
        }

        System.out.println("Osiągnięto temperaturę docelową " + actualTemp + " stopni");
    }
}


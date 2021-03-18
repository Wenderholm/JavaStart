package scannerTask;

import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScanCalcu option = new ScanCalcu();


        System.out.println("podaj pierwsza liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        System.out.println("wybierz jedną z opcji ");
        System.out.println("+ - dodanie liczb");
        System.out.println("- - odjęcie liczb");
        System.out.println("* - podzielenie liczb");
        System.out.println("/ - pomnożenie liczb");

        scanner.nextLine();
        String opt = scanner.nextLine();
        System.out.println("wybrana opcja to: " + opt);
        switch (opt) {
            case ("+"):
                double result1 = option.add(firstNumber, secondNumber);
                System.out.println(result1);
                break;
            case ("-"):
                double result2 = option.substract(firstNumber, secondNumber);
                System.out.println(result2);
                break;
            case ("*"):
                double result3 = option.multiply(firstNumber, secondNumber);
                System.out.println(result3);
                break;
            case ("/"):
                double result4 = option.divide(firstNumber, secondNumber);
                System.out.println(result4);
                break;
            default:
                System.out.println("zła opcja ");
        }
    }
    }

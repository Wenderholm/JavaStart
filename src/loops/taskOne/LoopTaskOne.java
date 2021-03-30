package loops.taskOne;

import java.util.Scanner;

public class LoopTaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb jaką chcesz zsumować");
        int numbers = scanner.nextInt();
        int sum = 0;

        while ( numbers > 0 ){
            System.out.println("Podaj kolejną liczbę: ");
            numbers--;
            sum += scanner.nextInt();
        }
        System.out.println("suma liczb wynosi: " + sum);
    }
}

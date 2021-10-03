package listy.zad2Liczba_z_warunkami;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondSolution {
    public static void main(String[] args) {
        List<Integer> numbers = readDataFromUser();
        showStatistic(numbers);
    }

    private static List<Integer> readDataFromUser() {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean isOk = true;
        while (isOk) {
            System.out.println("Podaj kolejną liczbę nieujemną, podzielną przez 5");
            num = sc.nextInt();
            if (num > 0 && num % 5 == 0) {
                numbers.add(num);
            } else {
                isOk = false;
            }
        }
        return numbers;
    }

    private static void showStatistic(List<Integer> numbers) {
        int sum = sumNumbers(numbers);
        double avg = sum / numbers.size();

        System.out.println("ilość wprowadzonych liczb to " + numbers.size());
        System.out.println("suma wprowadzonych liczb to " + sum);
        System.out.println("średnia wprowdzonych liczb to " + avg);
    }

    private static int sumNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number.intValue();
        }
        return sum;
    }

}

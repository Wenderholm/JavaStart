package klasaCollection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {
        System.out.println("witamy w losowaniu lotto ");
        List<Integer> userNumbers = readNumberFromUser();
        Lotto lotto = new Lotto();
        int result = lotto.checkResult(userNumbers);
        List<Integer> lottoResult = lotto.getLottoResult();
        System.out.println("Twoje liczby: " + userNumbers);
        System.out.println("Wynik losowania: " + lottoResult);
        System.out.println("Liczba trafień: " + result);
    }

    private static List<Integer> readNumberFromUser() {
        List<Integer> userNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Lotto.MAX_NUMBER; i++) {
            System.out.println("wybierz swoja liczbę: ");
            int nextNumber = input.nextInt();
            userNumbers.add(nextNumber);
        }
        return userNumbers;
    }
}

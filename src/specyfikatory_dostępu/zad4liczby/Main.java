package specyfikatory_dostępu.zad4liczby;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10000);
        System.out.println("liczba losowa: " + number);


        NumberInformation numberUtils = new NumberInformation();
        numberUtils.howBigIs(number,5000);
        numberUtils.oddOrEven(number);
        System.out.println("Uzupełniona do 4 cyfr: " + numberUtils.addZero(number));
    }
}

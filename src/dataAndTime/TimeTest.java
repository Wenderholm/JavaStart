package dataAndTime;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) throws InterruptedException {
//        Date date = new Date(1990, 10, 10);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(simpleDateFormat.format(date));

//    INSTANT - aktualny czas
//        DURATION odstęp pomiędzy wydarzeniami
//        Instant i1 = Instant.now();
//        for (int i = 0; i < 1000000; i++) {
//            System.out.println("miernik czasu");
//        }
//        Instant i2 = Instant.now();
//        Duration timeGap = Duration.between(i1, i2);
//        System.out.println("Pętla wykonała się w :" + timeGap.getSeconds() + " sekund");
//
//    }

//  Działanie/operacje na czasie LOCALTIME
//        LocalTime now = LocalTime.now();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(now);
//            now = now.plusSeconds(1);
//            Thread.sleep(1000);
//        }

//        LocalTime now = LocalTime.now();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(now.getHour() + " - " + now.getMinute() + " - "+ now.getSecond());
//            now = now.plusSeconds(1);
//            Thread.sleep(1000);
//        }


//        Działanie operacje na dacie LOCALDATE
        LocalDate now = LocalDate.now();
        LocalDate firstJanuary2014 = LocalDate.of(2014, 1, 1);
        System.out.println("Dziś jest " + now.getDayOfYear() + " dzień roku");
        System.out.println("Dziś jest " + now.getDayOfMonth()+ " dzień miesiąca");

//        sprawdzenie czy jakas data występuje po innej
//        boolean after = now.isAfter(firstJanuary2014);
//        System.out.println(after);
//
//        System.out.println(now.getYear());


//        POłaczenie daty i czasu
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Tworze nowe wydarzenie ");
//        System.out.println("Podaj dzień");
//        int day = scanner.nextInt();
//        System.out.println("Podaj miesiąc");
//        int month = scanner.nextInt();
//        System.out.println("Podaj rok");
//        int year = scanner.nextInt();
//        LocalDate createDate = LocalDate.of(year, month, day);
//        System.out.println("wydarzenie utowrzone na dzień " + createDate);

//        INACZEJ ZAPISANE POWYZSZE WCZYTANIE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tworze nowe wydarzenie ");
        System.out.println("Podaj datę w formacie yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String input = scanner.nextLine();


        LocalDate createDate = LocalDate.parse(input, dateTimeFormatter);
        System.out.println("wydarzenie utowrzone na dzień " + createDate);



    }
}

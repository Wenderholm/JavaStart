package dataAndTime;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class DataTimeExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("w celu rozpoczęcia pomiaru wciśnij enter");
        sc.nextLine();
        Instant s1 = Instant.now();

        System.out.println("zatrzymaj pomiar czasu naciśnij enter");
        sc.nextLine();
        Instant s2 = Instant.now();

        Duration timeBetween = Duration.between(s1, s2);
        System.out.println("pomiar czasu wynosi " + timeBetween.getSeconds());


    }
}

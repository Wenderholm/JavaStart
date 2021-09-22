package metody_konstruktory.calculate;

public class TimeTest {
    public static void main(String[] args) {
        TimeConventer tConventer = new TimeConventer();
        int hours = 14;
        int minuts = tConventer.hoursToMinutes(hours);
        int seconds = tConventer.minutesToSeconds(minuts);
        int milisecunds = tConventer.secondsToMiliseconds(seconds);

        System.out.println("Tyle godzin "+ hours+ " to: "+ minuts + "min "+seconds+"sec "+milisecunds+"ms.");
    }
}

package metody_konstruktory.zadanie3;

public class HomeTest {
    public static void main(String[] args) {
        Home home = new Home(10000, 10000);
        System.out.println(home.getStatus());
        System.out.println("bierzemy prysznic");
        home.takeShower();
        System.out.println(home.getStatus());
        System.out.println("oglądam tv przez 4 godziny");
        home.watchTv(4);
        System.out.println(home.getStatus());
    }
}

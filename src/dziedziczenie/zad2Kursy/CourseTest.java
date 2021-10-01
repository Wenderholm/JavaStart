package dziedziczenie.zad2Kursy;

public class CourseTest {
    public static void main(String[] args) {
        OnlineCourse online = new OnlineCourse("JAVA-ONLINE-123",299,"Kurs Java Online", "Najlepszy kurs programowania",600,1200);
        System.out.println("informacje o kursie " +online.getTitle());
        System.out.println("Opis: " + online.getDescription());
        System.out.println("Cena: " + online.getPrice() + "zł");
        System.out.println("Identyfikator: " + online.getId());
        System.out.println("Czas filmów w kursie: " + online.getVideoLenght() + "min");
        System.out.println("Czas potrzebny na przerobienie: " + online.getTimeToFinish() + "min");
    }
}

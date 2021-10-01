package dziedziczenie.zad2Kursy;

public class OfflineCourse extends Course {
    private String city;
    private int numberOfLessons;

    public OfflineCourse(String id, double price, String title, String description, String city, int numberOfLessons) {
        super(id, price, title, description);
        this.city = city;
        this.numberOfLessons = numberOfLessons;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }
}

package dziedziczenie.zad2Kursy;

public class BootcampOnline extends OnlineCourse {
    private String teacher;
    private int consultationHours;


    public BootcampOnline(String id, double price, String title, String description, int videoLenght, int timeToFinish, String teacher, int consultationHours) {
        super(id, price, title, description, videoLenght, timeToFinish);
        this.teacher = teacher;
        this.consultationHours = consultationHours;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(int consultationHours) {
        this.consultationHours = consultationHours;
    }
}

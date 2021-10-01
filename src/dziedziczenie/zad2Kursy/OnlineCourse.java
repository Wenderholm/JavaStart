package dziedziczenie.zad2Kursy;

public class OnlineCourse extends Course{
    private int videoLenght;
    private int timeToFinish;


    public OnlineCourse(String id, double price, String title, String description, int videoLenght, int timeToFinish) {
        super(id, price, title, description);
        this.videoLenght = videoLenght;
        this.timeToFinish = timeToFinish;
    }

    public int getVideoLenght() {
        return videoLenght;
    }

    public void setVideoLenght(int videoLenght) {
        this.videoLenght = videoLenght;
    }

    public int getTimeToFinish() {
        return timeToFinish;
    }

    public void setTimeToFinish(int timeToFinish) {
        this.timeToFinish = timeToFinish;
    }
}

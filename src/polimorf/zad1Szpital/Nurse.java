package polimorf.zad1Szpital;

public class Nurse extends Person{
    private double overtime;

    public Nurse(String firstName, String secondName, double salary, double overtime) {
        super(firstName, secondName, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public String getInfo(){
        return super.getInfo() + ",Nadgodziny: " + getOvertime();
    }
}

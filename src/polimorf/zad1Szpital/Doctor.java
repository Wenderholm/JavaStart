package polimorf.zad1Szpital;

public class Doctor extends Person{
    private double bonus;

    public Doctor(String firstName, String secondName, double salary, double bonus) {
        super(firstName, secondName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getInfo(){
        return super.getInfo() + ",Premia: " + getBonus();
    }
}

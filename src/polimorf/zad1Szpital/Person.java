package polimorf.zad1Szpital;

public class Person {
    private String firstName;
    private String secondName;
    private double salary;

    public Person(String firstName, String secondName, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getInfo(){
        return "Imię: " + getFirstName() + ", Nazwisko: " + getSecondName() + ",Wypłata: " + getSalary();
    }
}

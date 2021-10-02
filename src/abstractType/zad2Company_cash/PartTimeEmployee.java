package abstractType.zad2Company_cash;

public class PartTimeEmployee extends Employee {
    private double hours;
    private double hourlyWage;

    public PartTimeEmployee(String firstName, String lastName, double hours, double hourlyWage) {
        super(firstName, lastName);
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    double getMonthSalary() {
        return hours * hourlyWage;
    }

    @Override
    double getYearSalary() {
        return getMonthSalary() * NO_OF_MONTHS;
    }
}

package abstractType.zad2Company_cash;

public class FullTimeEmployee extends Employee {
    private static final double YEARLY_BONUS = 0.05;
    private double baseSalary;

    public FullTimeEmployee(String firstName, String lastName, double baseSalary) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double getMonthSalary() {
        return baseSalary;
    }

    @Override
    double getYearSalary() {
        double yearBaseSalary = baseSalary * NO_OF_MONTHS;
        double bonus =yearBaseSalary * YEARLY_BONUS;
        return yearBaseSalary + bonus;
    }
}

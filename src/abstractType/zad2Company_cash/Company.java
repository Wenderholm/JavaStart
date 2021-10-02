package abstractType.zad2Company_cash;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = createEmployee();
        double totalMonthlySalaries = totalMonthlySalaries(employees);
        double totalYearlySalaries = totalYearlySalaries(employees);

        printEmployees(employees);
        System.out.println("suma miesięcznych kosztów pracowników: " + totalMonthlySalaries);
        System.out.println("suma rocznych kosztów pracowników: " + totalYearlySalaries);
    }

    private static void printEmployees(Employee[] employees) {
        System.out.println("pracownicy: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double totalYearlySalaries(Employee[] employees) {
        double monthSumSalaries = 0;
        for (Employee employee : employees) {
            monthSumSalaries += employee.getMonthSalary();
        }
        return monthSumSalaries;
    }

    private static double totalMonthlySalaries(Employee[] employees) {
        double yearSumSalaries = 0;
        for (Employee employee : employees) {
            yearSumSalaries += employee.getYearSalary();
        }
        return yearSumSalaries;
    }

    private static Employee[] createEmployee() {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Jan", "Kowaslki", 2700);
        employees[1] = new PartTimeEmployee("Roman", "Olszewski", 100, 12.5);
        return employees;
    }
}

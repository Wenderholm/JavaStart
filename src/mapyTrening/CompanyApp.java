package mapyTrening;

import java.util.Scanner;

public class CompanyApp {
    private static final int ADD_EMPLOEE = 0;
    private static final int FIND_EMPLOEE = 1;
    private static final int EXIT = 2;
    private static final int SHOW = 3;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = new Company();
        int userOption;
        do {
            printOptions();
            System.out.println("wybierz opcje: ");
            userOption = sc.nextInt();
            sc.nextLine();
            switch(userOption){
                case ADD_EMPLOEE:
                    Employee employee = readAndCreateEmployee();
                    company.addEmployee(employee);
                    break;
                case FIND_EMPLOEE:
                    findEmployee(company);

                    break;
                case SHOW:
                    company.showAll();
                    sc.nextLine();
                    break;
                case EXIT:
                    System.out.println("do zobaczenia następnym razem ");
            }
        }while(userOption !=EXIT);
    }
        private static void findEmployee(Company company) {
            System.out.println("Podaj imię:");
            String firstName = sc.nextLine();
            System.out.println("Podaj Nazwisko:");
            String lastName = sc.nextLine();
            Employee employee = company.getEmployee(firstName, lastName);
            if(employee == null ){
                System.out.println("nie ma takiego pracownika");
            }else{
                System.out.println("pracuje u nas taka osoba jak : " + employee);
            }
        }
        private static Employee readAndCreateEmployee(){
            System.out.println("Podaj imię:");
            String firstName = sc.nextLine();
            System.out.println("Podaj Nazwisko:");
            String lastName = sc.nextLine();
            System.out.println("przypisz wynagrodzenie:");
            double salary = sc.nextDouble();

            sc.nextLine();

            return new Employee(firstName,lastName,salary);

        }


        private static void printOptions(){
            System.out.println(ADD_EMPLOEE + "- dodanie pracownika");
            System.out.println(FIND_EMPLOEE + "- wyszukiwanie pracownika");
            System.out.println(EXIT + "- wyjście z programu");
            System.out.println(SHOW + "- pokaz wszystkich ");
        }
    }

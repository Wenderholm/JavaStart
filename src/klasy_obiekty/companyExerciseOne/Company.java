package klasy_obiekty.companyExerciseOne;

public class Company {
    public static void main(String[] args) {
        Employee worker1 = new Employee();
        Employee worker2 = new Employee();
        Employee worker3 = new Employee();

        worker1.firstName = "Janek";
        worker1.secondName = "Nowak";
        worker1.yearOfBirth = 1990;
        worker1.seniority = 10;

        worker2.firstName = "Olek";
        worker2.secondName = "Lama";
        worker2.yearOfBirth = 1995;
        worker2.seniority = 5;

        worker3.firstName = "Adam";
        worker3.secondName = "Rak";
        worker3.yearOfBirth = 1986;
        worker3.seniority = 15;

        System.out.println("Pracownik nr 1:" + " Imię: " + worker1.firstName + "; Nazwisko: " + worker1.secondName
                + "; Rok urodzenia: " + worker1.yearOfBirth + "; Staż pracy: " + worker1.seniority );
        System.out.println("Pracownik nr 2:" + " Imię: " + worker2.firstName + "; Nazwisko: " + worker2.secondName
                + "; Rok urodzenia: " + worker2.yearOfBirth + "; Staż pracy: " + worker2.seniority );
        System.out.println("Pracownik nr 3:" + " Imię: " + worker3.firstName + "; Nazwisko: " + worker3.secondName
                + "; Rok urodzenia: " + worker3.yearOfBirth + "; Staż pracy: " + worker3.seniority );
    }
}

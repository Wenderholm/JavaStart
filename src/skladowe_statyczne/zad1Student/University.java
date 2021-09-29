package skladowe_statyczne.zad1Student;

public class University {
    public static void main(String[] args) {
        System.out.println("Liczba studentów przed dodaniem: " + Student.getStudentsNumber());
        Student s1 = new Student("Jan", "Nowak", 51222);
        Student s2 = new Student("Tomasz", "kowalski", 51321);
        System.out.println("Liczba studentów po zapisaniu nowych studentów: " + Student.getStudentsNumber());

    }
}


package arraysTraining;

public class DatabaseTest {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.add(new Person("Jan", "Kowalski", "12345"));
        database.add(new Person("Ania", "Zalewska", "234567"));
        database.add(new Person("Karol", "Piotrowski", "345678"));
        database.add(new Person("Patryk", "Bielecki", "45678"));
        Person person = database.get(3);
        System.out.println(person);
        System.out.println(database);
//        database.remove(new Person("Patryk", "Bielecki", "45678"));
//        database.remove(new Person("Jan", "Kowalski", "12345"));
        database.removeByName("Karol");
        System.out.println(database);
    }
}

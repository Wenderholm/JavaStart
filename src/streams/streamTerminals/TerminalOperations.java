package streams.streamTerminals;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
//        WYPISANIE WSZYSTKICH KURSÓW
//        courses.forEach(System.out::println);

//        ZLICZANIE ILOSCI KURSÓW
//        long streamSize = courses.count();
//        System.out.println(streamSize);

//         WYPISYWANIE MINIMALNEJ I MAX WARTOŚCI
//        courses.min((c1,c2) -> Double.compare(c1.getPrice(),c2.getPrice()));
//        poniżej to samo zapisane za pomoca comparingDouble
//        Optional<Course> cheapestCourse = courses.min(Comparator.comparingDouble(Course::getPrice));
//        cheapestCourse.ifPresent(System.out::println);

//        ANYMATCH - czy jakis element spełnia założenie
//        boolean under100 = courses.anyMatch(course -> course.getPrice() > 100);
//        if(under100)
//            System.out.println("conajmniej jeden z kursów jest tańszy niż 100 zł");

//        ALLMATCH - czy wszystkie elemety spełniają założenia
//        boolean above10 = courses.allMatch(course -> course.getPrice() > 10);
//        if(above10)
//            System.out.println("czy wszystkie kursy są droższe niz 10 zł");

//        NONEMATCH - czy wszystkie elemety niespełniają założenia
//        boolean above300 = courses.noneMatch(course -> course.getPrice() > 300);
//        if(above300)
//            System.out.println("wszystkie kursy są droższe niz 10 zł");

//        Zapisywanie do tablicy
//        Course[] coursesArray = courses.toArray(Course[]::new);
//        System.out.println(Arrays.toString(coursesArray));

//        ZAPISYWANIE DO KOLEKCJI
//        ArrayList<Object> coursesList = courses.collect(
//                ArrayList::new,
//                ArrayList::add,
//                ArrayList::addAll
//        );

//        zapisanie powyższego za pomocą COLLECTORA
//        List<Course> collect = courses.collect(Collectors.toList());
//        System.out.println(collect);
//        do konkretnej implementacji np. do treeSet
//        TreeSet<Course> collect1 = courses.collect(Collectors.toCollection(TreeSet::new));

//        METODA REDUCE - METODA TWORZACA JEDEN WYNIK Z RÓŻNYCH STRUMIENI
        Stream<String> names = Stream.of("Ania", "Kasia", "Basia");

        String allNames = names.reduce("", (result, next) -> result + next + " ");
        System.out.println(allNames);

//        ZLICZANIE CEN KURSÓW
        Double sumePrice = courses.map(Course::getPrice).reduce(0.0, Double::sum);
        System.out.println("wszystkie kursy kosztują " + sumePrice);
    }
}

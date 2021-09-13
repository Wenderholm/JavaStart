package streams.streamIntermediate;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
//        Stream<Course> courses = Stream.of(
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(1L, "Zarządzanie zespołem", 159, "Biznes"),
//                new Course(3L, "Tajniki Google", 299, "Marketing"),
//                new Course(1L, "Python od podstaw", 199, "Programowanie")
//        );

//        wypisanie kursów droższych niz 200 zł
//        Stream<Course> expensiveCourses = courses.filter(course -> course.getPrice() > 200);
//        expensiveCourses.forEach(System.out::println);
//

//        POWYŻSZY ZAPIS MOZEMY ZAPISA INACZEJ
//        Stream.of(
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(1L, "Zarządzanie zespołem", 159, "Biznes"),
//                new Course(3L, "Tajniki Google", 299, "Marketing"),
//                new Course(1L, "Python od podstaw", 199, "Programowanie")
//        )
//        .filter(course -> course.getPrice() < 200)
//        .forEach(System.out::println);

//  łaczenie dwóch struktur
//        Course[] cheapCourses = {
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty")
//        };
//
//        Course[] expensiveCourses = {
//                new Course(3L, "Tajniki Google", 299, "Marketing"),
//                new Course(1L, "Python od podstaw", 199, "Programowanie")
//        };
//
//        Stream.of(cheapCourses, expensiveCourses)
//                .flatMap(Arrays::stream)
//                .forEach(System.out::println);

//        wypisywanie 100 kolejnych list
        List<Integer> collect = IntStream.iterate(0, n -> n + 1)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect);

//        USUWANIE DUPLIKATÓW Z OBIEKTÓW
//        Stream<Course> courses = Stream.of(
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(3L, "Tajniki Google", 299, "Marketing"),
//                new Course(1L, "Java", 249, "Programowanie")
//        );
//        Stream<Course> distinct = courses.distinct();
//        distinct.forEach(System.out::println);

//        MAPOWANIE NA STRUMIENIU - wyszukanie wszystkich kursów które dotyczą java
//        Stream<Course> courses = Stream.of(
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(1L, "Zarządzanie zespołem", 159, "Biznes"),
//                new Course(3L, "Tajniki Google", 299, "Marketing"),
//                new Course(1L, "Java od podstaw", 199, "Programowanie")
//        );
//        List<String> javaTitle = courses
//                .map(Course::getName)
//                .filter(name -> name.toLowerCase().contains("java"))
//                .collect(Collectors.toList());
//        System.out.println(javaTitle);

        
//        SORTOWANIE W OBIEKCIE - sortowanie po cenie
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Zarządzanie zespołem", 159, "Biznes"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );

//        Stream<Course> sortedCourses = courses.sorted(Comparator.comparingDouble(Course::getPrice));
//        sortedCourses.forEach(System.out::println);

//      SPRAWDZENIE FILTROWANIA I WYSZUKANIA JAVA
//        List<String> javaTitle = courses
//                .filter(c -> c.getName().toLowerCase().contains("java"))
//                .peek(course -> System.out.println("filtered stream: " + course))
//                .map(Course::getName)
//                .collect(Collectors.toList());
//        System.out.println(javaTitle);

//        SKIP pominięcie ilości elementów np. 3 - skip(3)
        Stream<Course> withoutCheapCourses = courses
                .sorted(Comparator.comparingDouble(Course::getPrice))
                .skip(3);
        withoutCheapCourses.forEach(System.out::println);
    }
}

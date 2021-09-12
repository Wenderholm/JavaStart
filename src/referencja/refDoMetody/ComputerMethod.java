package referencja.refDoMetody;

import java.util.List;
import java.util.function.Consumer;

public class ComputerMethod {
    @SuppressWarnings("LambdaBodyCanBeCodeBlock")
    public static void main(String[] args) {

//        przykład działani metody overclock();
//        Computer lenovo = new Computer("Lenovo", 3000, 45);
//        lenovo.overclock();
//        System.out.println(lenovo.getCpu() + " / " + lenovo.getTemperature());


//        poniższa lista jest niemodyfiowalna. nie mozemy doniej nic dodawać ani nie możemy z niej nic usunąć
        List<Computer> computers = List.of(
                new Computer("Lenovo", 3000, 45),
                new Computer("HP", 3200, 66),
                new Computer("Apple", 3400, 78),
                new Computer("Asus", 2800, 42)
        );

//        wyświetlenie komputerów z dopisaniem komunikatu w zależności od temperatury 
//        pierwsza linia moze być zapisana tak :
//        consume(computers , c -> {
//        ponieważ zostanie to wywnioskowane z consume gdzie Computer jest podawany już

//        consume(computers , (Computer c) -> {
//            String textToPrint = c.getName() + " " + c.getCpu();
//            if(c.getTemperature() < 50)
//                textToPrint += " / cold";
//            else
//                textToPrint += " / hot";
//            System.out.println(textToPrint);
//        });


//        consume wydzielone do metody jest bardziej czytelne i przypisujemy do jakiejs zmiennej

        consume(computers, Computer::overclock);
//        to jest to samo co:  consume(computers, c -> c.overclock());

//        referencja do metody która musi byc static
        consume(computers, ComputerMethod::printComputerWithTemperature);

//        można zapisać jeszcze tak ale metoda printComputerWithTemperature nie moze być static
//        ComputerMethod computerMethod = new ComputerMethod();
//        consume(computers, computerMethod::printComputerWithTemperature);
    }
    private static void printComputerWithTemperature(Computer computer) {
        String textToPrint = computer.getName() + " " + computer.getCpu();
        if (computer.getTemperature() < 50)
            textToPrint += " / cold";
        else
            textToPrint += " / hot";
        System.out.println(textToPrint);
    }

    private static void consume(List<Computer> computers, Consumer<Computer> consumer) {
        for (Computer computer : computers) {
            consumer.accept(computer);
        }
    }
}

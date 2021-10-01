package wprowadzenie_danych_wyjątki.exception_zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        Competition competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        System.out.println("Podaj nazwę zawodów:");
        String competitionName = scanner.nextLine();
        System.out.println("Podaj maksymalną liczbę uczestników:");
        int maxParticipants = readPositiveNumber();
        System.out.println("Podaj ograniczenie wiekowe:");
        int ageLimit = readPositiveNumber();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            Participant participant = createParticipant();
            try{
                competition.addParticipant(participant);
            }catch(AgeViolationException e){
                System.out.println("nie dodano uczetnika. minimalny wiek to "+e.getAgeRequired());

            }catch (DuplicateException e){
                System.out.println("uczestnik o wskazanym id został juz doddany do tych zasobów "+ e.getParticipant());
            }

        }
    }

    private Participant createParticipant() {
        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj id (np. pesel):");
        String id = scanner.nextLine();
        System.out.println("Podaj wiek:");
        int age = readPositiveNumber();
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }
//    dodano do zadania zabezpieczenie przed wpisaniem innych znaków niz liczba i liczb ujemnych
    private int readPositiveNumber(){
        int num = -1;
        while(num<0){
            try{
                num = scanner.nextInt();
                if(num < 0 )
                    System.out.println("podana liczba musi być dodatnia");
            }catch (InputMismatchException e){
                System.out.println("musisz podać liczbę, spróbój ponownie");
            }finally{
                scanner.nextLine();
            }
        }
        return num;
    }
}

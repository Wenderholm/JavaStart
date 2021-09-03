package kolejki;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    private Queue<Task> taskQueue = new PriorityQueue<>();
    private Scanner sc = new Scanner(System.in);

    void mainLoop(){
        Option option;
        do{
            printOption();
            System.out.println("wybnierz opcję: ");
            option = Option.createFromInt(sc.nextInt());
            sc.nextLine();
            switch(option){
                case ADD:
                    taskQueue.offer(readAndCreateTask());
                    System.out.println("Zadanie dodane do kolejki");
                    break;
                case TAKE:
                    takeTask();
                    break;
                case EXIT:
                    System.out.println("Papa!");
                    break;
            }
        }
        while(option != Option.EXIT);
    }

    private void takeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("Brak zadań do wykonania");
        } else {
            Task nextTask = taskQueue.poll();
            System.out.print("Zadanie do wykonania: ");
            System.out.println(nextTask);
        }
    }

    private Task readAndCreateTask() {
        System.out.println("podaj nazwe zadania: ");
        String name = sc.nextLine();
        System.out.println("opisz zadanie: ");
        String description = sc.nextLine();
        System.out.println("Podaj priorytet: ");
//        pętla po vartościach jakie są w priority (high, medium, low)
        for (Task.Priority priority : Task.Priority.values()){
            System.out.println(priority + " ");
        }
        System.out.println();
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine());
        return new Task(name, description, priority);
    }

    private void printOption(){
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value);
        }
    }


    private enum Option {
        ADD(0,"Dodaj zadanie"),
        TAKE(1, "Zrób zadanie z kolejki"),
        EXIT(2, "Wyjdz z programu");

        int option;
        String description;
        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }
        // zwraca wartosc z podaną opcją
        static Option createFromInt(int option){
            return values()[option];
        }

        @Override
        public String toString() {
            return option + " " + description;
        }
    }
}
// dodanie obsługi złego wbrania opcji
// doadnie złego wpisania enum
// dodanie wczytywania z pliku zadań przesłanych przez kogoś
package arrays.zad2winda;

public class Elevator {
    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    void add(Person person) {
        if(peopleNumber < 4){
            people[peopleNumber] = person;
            peopleNumber++;
        }else{
            System.out.println("Nie wejdzie do windy więcej. Proszę czekać");
        }
    }

    void start() {
        if(weightCorrect()){
            System.out.println("winda wystartowała");
        }else{
            int overload = getTotalWeight() - maxWeight;
            System.out.println("winda przeciązona o : "+ overload+ " kg");
        }
    }

    private boolean weightCorrect() {
        return getTotalWeight()<maxWeight;
    }

    int getTotalWeight() {
        int totalWeight = 0;
        if(people[0]!=null){
            totalWeight += people[0].getWeight();
        }
        if(people[1]!=null){
            totalWeight += people[1].getWeight();
        }
        if(people[2]!=null){
            totalWeight += people[2].getWeight();
        }
        if(people[3]!=null){
            totalWeight += people[3].getWeight();
        }
        return totalWeight;
    }

    void clear() {
        people[0]=null;
        people[1]=null;
        people[2]=null;
        people[3]=null;
        peopleNumber = 0;
        System.out.println("winda jest pusta");
    }

}

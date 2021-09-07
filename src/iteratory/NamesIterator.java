package iteratory;

import java.util.*;

public class NamesIterator {
    public static void main(String[] args) {
        Map<String, InformationPerson> people = new TreeMap<>();

        people.put("Kowalski", new InformationPerson("Jan", "Kowalski", 45));
        people.put("Romanowski", new InformationPerson("Adam", "Romanowski", 25));
        people.put("Lewandowski", new InformationPerson("Andrzej", "Lewandowski", 21));
        people.put("Adamkiewicz", new InformationPerson("Roman", "Adamkiewicz", 75));

        //   iterowanie po mapie i wypisywanie vartości
        Collection<InformationPerson> value = people.values();
        Iterator<InformationPerson>  valIterator = value.iterator();
        while (valIterator.hasNext()){
            System.out.println(valIterator.next());
        }
        //   iterowanie po mapie i wypisywanie kluczy
        Set<String> value2 = people.keySet();
        Iterator<String> valIterator2 = value2.iterator();
        while (valIterator2.hasNext()){
            System.out.println(valIterator2.next());
        }
    }
}
//dodawnie do mapy z klawiatury
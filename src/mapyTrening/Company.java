package mapyTrening;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Company {
    private Map<String,Employee> employees = new HashMap<>();

    boolean addEmployee(Employee employee){
        String key = employee.getFirstName() + " " + employee.getLastName();

        if(employees.containsKey(key)){
            return false;
        }
        employees.put(key, employee);
        return true;
    }

    Employee getEmployee(String firstName, String lastName){
        String key = firstName + " " + lastName;
        return employees.get(key);
    }

    void showAll(){
        if(employees.size() == 0){
            System.out.println("nikt nie pracuje w firmie. dodaj pracownika ");
        }else {

            System.out.println("lista wszystkich pracowników");
//            zwraca wartości czyli imię nazwisko oraz salary to co jest w employee
            Collection<Employee> values = employees.values();
            for (Employee val: values) {
                System.out.println("Pracownik: " + val);
            }
//            zwraca klucze
//            Set<String> keys = employees.keySet();
//            for (String key : keys) {
//                System.out.println(key);
//            }
        }
    };
}

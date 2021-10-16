package collection_task_1.compare;

import collection_task_1.compare.models.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTest {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(102, "Ivan", "Sidorov", 23);
        Employee emp2 = new Employee(76, "Ariya", "Stepanova", 34);
        Employee emp3 = new Employee(34, "Valerii", "Ivanov", 29);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After id sorting \n" + list);
        Collections.sort(list, new AgeComparator());
        System.out.println("After age sorting \n" + list);
        Collections.sort(list, new NameComparator());
        System.out.println("After name sorting \n" + list);


    }
}

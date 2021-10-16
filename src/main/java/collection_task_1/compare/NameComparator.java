package collection_task_1.compare;

import collection_task_1.compare.models.Employee;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}
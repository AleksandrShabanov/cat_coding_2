package collection_task_1.compare;

import collection_task_1.compare.models.Employee;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.getAge() == emp2.getAge()) {
            return 0;
        }
        else if (emp1.getAge() < emp2.getAge()) {
            return -1;
        }
        else {
            return 1;
        }
    }
}

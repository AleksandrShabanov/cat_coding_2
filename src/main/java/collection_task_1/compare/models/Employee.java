package collection_task_1.compare.models;

public class Employee implements Comparable<Employee> {
    private int employeeId;
    private String name;
    private String surname;
    private int age;

    public Employee() {
    }

    public Employee(int employeeId, String name, String surname, int age) {
        this.employeeId = employeeId;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee emp) {
        if (this.employeeId == emp.employeeId) {
            return 0;
        }
        else if (this.employeeId < emp.employeeId) {
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

}

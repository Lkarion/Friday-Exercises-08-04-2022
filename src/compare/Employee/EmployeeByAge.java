package compare.Employee;

import java.util.Comparator;

public class EmployeeByAge implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age - o2.age;
    }
}

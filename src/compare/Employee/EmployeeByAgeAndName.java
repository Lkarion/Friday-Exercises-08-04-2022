package compare.Employee;

import java.util.Comparator;

public class EmployeeByAgeAndName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
            return o1.age-o2.age == 0 ?
                    o1.name.compareTo(o2.name) :
                    o1.age-o2.age;
    }
}

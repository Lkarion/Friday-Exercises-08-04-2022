package compare.Employee;
//4.есть класс Employee c  полями  id,name, age, salary.  Сделать его comparable по id.
// Создать дополнительные возможности сортирвоки по: зарплате, возрасту, имени а также возможность
// сортирвоки по имени если возраст одинаковый.  В решении использовать ArrayList. Написать тесты

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    int age;
    double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }




    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Peter", 26, 2300);
        Employee e2 = new Employee(134, "Vasya", 34, 3500);
        Employee e3 = new Employee(123, "Karl", 43, 1500);
        Employee e4 = new Employee(100, "Mary", 29, 4000);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        list.sort(new EmployeeByAge());
        System.out.println("By Age: "+list);
        list.sort(new EmployeeByName());
        System.out.println("By Name: "+list);
        list.sort(new EmployeeBySalary());
        System.out.println("By Salary: "+list);
        list.sort(new EmployeeByAgeAndName());
        System.out.println("By Name is equal Age: "+list);
    }
}

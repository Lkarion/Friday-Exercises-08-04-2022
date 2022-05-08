package compare.Employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee e1 = new Employee(100, "Peter", 26, 2300);
    Employee e2 = new Employee(134, "Vasya", 34, 3500);
    Employee e3 = new Employee(123, "Karl", 43, 1500);
    Employee e4 = new Employee(100, "Mary", 29, 4000);


    List<Employee> list = new ArrayList<>();
    List<Employee> listExp = new ArrayList<>();

    @BeforeEach
    void init(){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }

    @Test
    void test_sort_ByName(){
        listExp.add(e3);
        listExp.add(e4);
        listExp.add(e1);
        listExp.add(e2);
        list.sort(new EmployeeByName());
        assertEquals(listExp,list);
    }
    @Test
    void test_sort_ByAge(){
        listExp.add(e1);
        listExp.add(e4);
        listExp.add(e2);
        listExp.add(e3);
        list.sort(new EmployeeByAge());
        assertEquals(listExp,list);
    }
    @Test
    void test_sort_ByNameSalary(){
        listExp.add(e3);
        listExp.add(e1);
        listExp.add(e2);
        listExp.add(e4);
        list.sort(new EmployeeBySalary());
        assertEquals(listExp,list);
    }
    @Test
    void test_sort_ByAgeAndName(){
        listExp.add(e1);
        listExp.add(e4);
        listExp.add(e2);
        listExp.add(e3);
        list.sort(new EmployeeByAgeAndName());
        assertEquals(listExp,list);
    }
}
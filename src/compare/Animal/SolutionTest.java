package compare.Animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Animal a1 = new Animal("Bow", 14.3, "black");
    Animal a2 = new Pet("Boris", 4.1, "white", "Peter");
    Animal a3 = new Pet("Mursik", 3.5, "grey","Vasya");

    List<Animal> list = new ArrayList<>();
    List<Animal> listExp = new ArrayList<>();

    @BeforeEach
    void init(){
        list.add(a1);
        list.add(a2);
        list.add(a3);
    }

    @Test
    void test_sort_ByName(){
        listExp.add(a2);
        listExp.add(a1);
        listExp.add(a3);
        list.sort(new AnimalByName());
        assertEquals(listExp,list);
    }
    @Test
    void test_sort_ByWeight(){
        listExp.add(a3);
        listExp.add(a2);
        listExp.add(a1);
        list.sort(new PetByWeight());
        assertEquals(listExp,list);
    }
    @Test
    void test_sort_ByNameReverse(){
        listExp.add(a3);
        listExp.add(a2);
        listExp.add(a1);
        list.sort(new AnimalByNameReverse());
        assertEquals(listExp,list);
    }
}
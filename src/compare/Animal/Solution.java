package compare.Animal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
       // Вывести на экран список животных, упорядоченный по имени, список домашних животных(из класса
// Pet) упорядоченный по весу и список имен животных упорядоченный по возрастанию последней буквы
// имени животного. Использовать компараторы.  Написать тесты
        Animal a1 = new Animal("Bow", 14.3, "black");
        Animal a2 = new Pet("Boris", 4.1, "white", "Peter");
        Animal a3 = new Pet("Mursik", 3.5, "grey","Vasya");
        Animal a4 = new Animal("Tusik", 7, "black");

        List<Animal> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.sort(new AnimalByNameReverse());
        System.out.println("By Name Last Letter: "+list);
        list.sort(new AnimalByName());
        System.out.println("By Name: "+list);
        list.sort(new PetByWeight());
        System.out.println("By Weight: "+list);
    }
}

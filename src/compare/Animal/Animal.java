package compare.Animal;
//3. создать класс Animal с полями name, weight, colour  и класс Pet  расширяющий его с доп. полем
// owner.  Вывести на экран список животных, упорядоченный по имени, список домашних животных(из класса
// Pet) упорядоченный по весу и список имен животных упорядоченный по возрастанию последней буквы
// имени. Использовать компараторы.  Написать тесты


import java.util.Comparator;

public class Animal {
    String name;
    double weight;
    String colour;

    public Animal(String name, double weight, String colour) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }

}

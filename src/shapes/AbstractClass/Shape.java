package shapes.AbstractClass;

import java.util.Arrays;
//1. используя абстрактные классы написать программу выводящую на экран упорядоченный по
//  возрастанию площади массив из геометрических фигур (круг,квадарт,прямоугольеик). Протестировать
//правильность сортировки

//    2.используя интерфейсы написать метод, позволяющий вычислить
//    общую площадь нескольких фигур(круг,квадарт,прямоугольник)
// т.е. если площадь круга =50, прямоугольеика 100 , то в сумме 150 ). Протестировать

//3. создать класс Animal с полями name, weight, colour  и класс Pet  расширяющий его с доп. полем
// owner.  Вывести на экран список животных, упорядоченный по имени, список домашних животных(из класса
// Pet) упорядоченный по весу и список имен животных упорядоченный по возрастанию последней буквы
// имени. Использовать компараторы.  Написать тесты

//4.есть класс Employee c  полями  id,name, age, salary.  Сделать его comparable по id.
// Создать дополнительные возможности сортирвоки по: зарплате, возрасту, имени а также возможность
// сортирвоки по имени если возраст одинаковый.  В решении использовать ArrayList. Написать тесты
public abstract class Shape implements Comparable<Shape>{
    abstract int getSquare();

    @Override
    public int compareTo(Shape o) {
        return this.getSquare()-o.getSquare();
    }






    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Circle(1);
        Shape s3 = new Rectangle(5,2);
        Shape s4 = new Square(5);
        Shape s5 = new Square(3);

        Shape[] shapes = {s1,s2,s3,s4,s5};
        print(shapes);
        System.out.println("______________________");
        Arrays.sort(shapes);
        print(shapes);

    }
    public static void print(Shape[] shapes){
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }
}

package compare.shapes.Interface;

import compare.shapes.AbstractClass.Shape;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        ShapesInterface s1 = new Circle(5);
        ShapesInterface s2 = new Circle(1);
        ShapesInterface s3 = new Rectangle(5,2);
        ShapesInterface s4 = new Square(5);
        ShapesInterface s5 = new Square(3);

        System.out.println(getSumSquare(s1,s2));
        System.out.println(getSumSquare(s3,s4));
        System.out.println(getSumSquare(s3,s4,s5));
    }

    public static int getSumSquare(ShapesInterface... shapesInterfaces){
       /* int sum = 0;
        for (ShapesInterface s : shapesInterfaces) {
            sum += s.getSquare();
        }
        return sum;*/

        return Arrays.stream(shapesInterfaces)
                .mapToInt(ShapesInterface::getSquare)
                .sum();
    }
}

package shapes;

import java.util.Arrays;

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

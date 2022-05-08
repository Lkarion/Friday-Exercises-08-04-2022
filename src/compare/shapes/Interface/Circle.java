package compare.shapes.Interface;

public class Circle implements ShapesInterface{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public int getSquare() {
            if (radius >= 0)
                return (int)(Math.PI*radius*radius);
            else return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

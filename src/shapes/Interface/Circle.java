package shapes.Interface;

public class Circle implements ShapesInterface{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public int getSquare() {
        try {
            if (radius >= 0)
                return (int)(Math.PI*radius*2);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

package shapes.Interface;

public class Square implements ShapesInterface{
    int side;

    public Square(int side) {
        this.side = side;
    }


    @Override
    public int getSquare() {
        return side*side;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

package Garden;

public class Flower extends Plants {
    private static final double growSpeed = 0.5;

    public Flower(String name, int age, double height) {
        super(name, age, height);
    }

    @Override
    public double grow(Season season){
        // Цветы: зимой не растут, летом тоже не растут а цветут,осенью их срезают
        switch (season){
            case SPRING: return this.getHeight() +growSpeed;
            case AUTUMN: return 0;
            default: return this.getHeight();
        }
    }
}

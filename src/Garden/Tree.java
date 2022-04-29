package Garden;

public class Tree extends Plants {
    private static final double growSpeed = 0.5;

    public Tree(String name, int age, double height) {
        super(name, age, height);
    }

    @Override
    public double grow(Season season){
        //Деревья: зимой не растут,летом растут,осенью не растут, весной растут
        switch (season){
            case SPRING:
            case SUMMER:
                return this.getHeight()+growSpeed;
            default: return this.getHeight();
        }
    }
}

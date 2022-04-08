public class Tree extends Plants{
    final double growSpeed = 0.5;

    public Tree(String name, int age, double height) {
        super(name, age, height);
    }

    @Override
    public double grow(Season season){
        //Деревья: зимой не растут,летом растут,осенью не растут, весной растут
        switch (season){
            case SPRING: return this.getHeight()+growSpeed;
            case SUMMER: return this.getHeight()+growSpeed;
            case AUTUMN: return this.getHeight();
            case WINTER: return this.getHeight();
            default: return this.getHeight();
        }
    }
}

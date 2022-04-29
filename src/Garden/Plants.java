package Garden;

public abstract class Plants {
    private String name;
    private int age;
    private double height;

    public Plants(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public abstract double grow(Season season);

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

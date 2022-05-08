package compare.Animal;

import java.util.Comparator;

public class Pet extends Animal {
    String owner;

    public Pet(String name, double weight, String colour, String owner) {
        super(name, weight, colour);
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

}

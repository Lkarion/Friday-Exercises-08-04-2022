package compare.Animal;

import java.util.Comparator;

public class AnimalByNameReverse implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int lastIndexO1 = o1.name.length()-1;
        int lastIndexO2 = o2.name.length()-1;
        return o1.name.charAt(lastIndexO1)
                - o2.name.charAt(lastIndexO2);
    }
}

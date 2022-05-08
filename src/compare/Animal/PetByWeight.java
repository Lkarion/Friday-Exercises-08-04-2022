package compare.Animal;

import java.util.Comparator;

public class PetByWeight  implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.weight - o2.weight > 0) return 1;
        else if (o1.weight - o2.weight < 0) return -1;
        else return 0;
    }
}

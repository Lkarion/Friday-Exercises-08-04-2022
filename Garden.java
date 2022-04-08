public class Garden {

    public static void main(String[] args) {
/**
 * Садовод-любитель
 * Выращиваем растения в течение нескольких лет и смотрим что будет
 * Задача: выращиваем деревья и цветы. Каждый из этих видов имеет следующие характеристики
 * -name,height,age.  Каждый из видов растений вырастает за сезон на разную высоту, одинаковую для всех деревьев
 * и всех цветов
 *
 * Каждый сезон состоит из четырех времен года , в которые цветы и деревья ведут себя не всегда одинаково
 * Сезон для  цветов и деревьев начинается весной
 * Цветы: зимой не растут, летом тоже не растут а цветут,осенью их срезают
 * Деревья: зимой не растут,летом растут,осенью не растут, весной растут
 * В классе Garden создать по одному цветку и дереву и создать метод growPlants в котором происходит
 * процесс роста этих двух растений в течение нескольких лет.
 *
 * */
Tree tree1 = new Tree("Bereza", 4, 2);
Flower flower1 = new Flower("Pion", 4, 1);

growPlants(tree1,3);
growPlants(flower1,2);
    }

    public static void growPlants(Plants p, int years){

        for (int i = 1; i <= years; i++) {
            for (Season s: Season.values()) {
                if (s.equals(Season.SPRING))
                    p.setAge(p.getAge()+1);
                p.setHeight(p.grow(s));
                System.out.println(i + " year - " + s + ":" +
                        "\n" + p.getName() + " is " +
                        p.getAge() + " years of age and " +
                        p.getHeight() + " m high");
            }
        }
       // System.out.println(season, age, height);
    }

}

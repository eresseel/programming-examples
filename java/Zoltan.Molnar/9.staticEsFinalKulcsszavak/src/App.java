import v1.animals.Animal;

public class App {
    public static void main(String[] args) throws Exception {
        final double maxWeight = 50.2; // itt is alandot definialunk

        Animal cat = new Animal("Dormi", Animal.DOMESTIC);
        Animal dog = new Animal("Bodri", true);
        System.out.println(Animal.numberOfAnimals);

        Animal cat2 = new Animal("Micike", Animal.WILD);
        Animal dog2 = new Animal("Domino", false);
        System.out.println(Animal.numberOfAnimals);

        Animal.numberOfAnimals = 10;
        System.out.println(Animal.numberOfAnimals);

        System.out.println(Animal.getNumberOfAnimals2());
    }

    public static int product(final int a, final int b) { // a es b erteke allando
        return a * b;
    }
}

package animals;

public final class Animal {
    public final static boolean WILD = false;
    public final static boolean DOMESTIC = true;
    private static int numberOfAnimals = 0;
    private String name;
    private double weight;
    private boolean domesticated;

    public Animal(String myName, boolean isItDomesticated) {
        numberOfAnimals++;
        domesticated = isItDomesticated;
        name = myName;
    }

    static {
    }

    static {
    }

    // inicializalo block, bemasolodik minden konstruktor elejere
    // ebbol is lehet tobb
    {
        weight = 10.0;
    }

    {
        domesticated = false;
    }

    public Animal() {
        this("No name", DOMESTIC);
    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isDomesticated() {
        return domesticated;
    }

    public void setDomesticated(boolean domesticated) {
        this.domesticated = domesticated;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "'" + name + "' is a " + (domesticated ? "domesticated" : "wild") + " animal with a weight of " + weight
                + " gramms";
    }
}

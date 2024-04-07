package v1.animals;

public final class Animal { // ha a final kulcsszo szerepel akkor ebbol az osztalybol nem lehet
                            // orokoltetni
    public static int numberOfAnimals = 0; // osztaly szintu valtozo, minden peldany osztozik ezen valtozon es
                                           // erteken
    private final static int numberOfAnimals2; // nem lehet a valtozo erteket modositani, masneven konstans
    private final String name; // peldany valtozo, ez is konstans lesz
    private double weight; // peldany valtozo
    private boolean domesticated; // peldany valtozo

    public final static boolean WILD = false;
    public final static boolean DOMESTIC = true;

    static {
        numberOfAnimals2 = 1000;
        Animal.getNumberOfAnimals2();
        // doSomething(); // hiba

    }

    public Animal(String myName, boolean isItDomesticed) {
        numberOfAnimals++;
        domesticated = isItDomesticed;
        name = myName;
    }

    public static int getNumberOfAnimals2() {
        // doSomething(); // hibas
        return numberOfAnimals2;
    }

    public final void doSomething() { // ha a final kulcsszo szerepel a fuggvenyben, akkor a leszarmaztatott
                                      // osztalyban nem lehet felul definialni ezt a fuggvenyt
        Animal.getNumberOfAnimals2();
    }
}

package v1.animals;

public class Animal { // a public kulcsszo elhagyasaval csak csomag szintu az osztaly
    public String name; // mindenki latja
    protected double weight; // csomagszinten es orokolt osztaly eseten ez a valtozo latszodik
    boolean domesticated; // csomagszintu valtozo, csak a package-ban lathato
    private int age; // osztaly szintu valtozo

    public void doSomething() { // barki meghivhatja
    }

    protected void doSomething2() { // csomagszinten es orokolt osztaly eseten ez a fuggveny latszodik
    }

    void doSomething3() { // csomagszinten lathato ez a fuggveny
    }

    private void Animal() { // osztaly szinten lathato ez a fuggveny
    }

    public void Animal(int a) { // barki meghivhatja
    }

    protected void Animal(double a) { // csomagszinten es orokolt osztaly eseten ez a fuggveny latszodik
    }

    void Animal(float a) { // csomagszinten lathato ez a fuggveny
    }

    private void Animal(boolean a) { // osztaly szinten lathato ez a fuggveny
    }
}

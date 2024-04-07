package v1;

import v1.animals.Animal;

public class Goldfish extends Animal {
    public void valami() {
        System.out.println("My weight is: " + weight);
        // System.out.println("My weight is: " + domesticated); // itt mar nem latom
        // mert csomag szintu valtozo, csak a package-ban lathato
        // System.out.println("My weight is: " + age); // nem lathato, mert osztaly
        // szintu valtozo
        doSomething();
        doSomething2(); // csomagszinten es orokolt osztaly eseten ez a fuggveny latszodik
        // doSomething3(); // csomagszinten lathato ez a fuggveny
        // doSomething4(); // osztaly szinten lathato ez a fuggveny
    }
}

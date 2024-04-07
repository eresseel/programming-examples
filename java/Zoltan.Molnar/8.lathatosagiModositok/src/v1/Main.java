package v1;

import v1.animals.Animal;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal dog = new Animal();

        dog.name = "Bodri";
        // dog.weight = 2.69; // itt mar nem latom mert protected a valtozo
        // dog.domesticated = true; // itt mar nem latom mert csomag szintu valtozo,
        // csak a package-ban lathato
        // dog.age = 15; // nem lathato, mert osztaly szintu valtozo
        dog.doSomething();
        // dog.doSomething2(); // csomagszinten es orokolt osztaly eseten ez a fuggveny
        // latszodik
        // dog.doSomething3(); // csomagszinten lathato ez a fuggveny
        // dog.doSomething4(); // osztaly szinten lathato ez a fuggveny
    }
}

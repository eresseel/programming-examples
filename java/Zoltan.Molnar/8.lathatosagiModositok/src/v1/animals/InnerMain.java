package v1.animals;

public class InnerMain {
    public static void main(String[] args) throws Exception {
        Animal cat = new Animal();

        cat.name = "Micika";
        cat.weight = 2.69;
        cat.domesticated = true;
        // cat.age = 15; // nem lathato, mert osztaly szintu valtozo
        cat.doSomething();
        cat.doSomething2();
        cat.doSomething3(); // csomagszinten lathato ez a fuggveny
        // cat.doSomething4(); // osztaly szinten lathato ez a fuggveny
    }
}

import animals.*;

public class AnimalMain {
    public static void main(String[] args) throws Exception {
        Animal cat = new Animal("Sziamiau", Animal.DOMESTIC);
        Animal noName = null;

        System.out.println(cat);
        System.out.println(new Animal());
        System.out.println(noName);

        noName = cat;
        System.out.println(noName);
    }
}

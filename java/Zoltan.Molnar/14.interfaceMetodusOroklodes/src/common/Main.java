package common;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        User geza = new User("Geza", 43);
        User amalia = new User("Amalia", 28);
        User jozsi = new User("Jozsi", 33);
        User kati = new User("Kati", 33);

        User[] felhasznalok = { geza, amalia, jozsi, kati };
        System.out.println(Arrays.toString(felhasznalok));

        Arrays.sort(felhasznalok);
        System.out.println(Arrays.toString(felhasznalok));

        Arrays.sort(felhasznalok, new AgeComparator());
        System.out.println(Arrays.toString(felhasznalok));
    }
}

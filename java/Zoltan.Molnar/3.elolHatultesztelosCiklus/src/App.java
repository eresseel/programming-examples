import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int szam = 0;

        // eloltesztelos ciklus
        while (szam <= 100) {
            System.out.println(szam);
            szam += 13;
        }

        // hatultesztelos ciklus
        int szam2;
        Scanner beolvaso = new Scanner(System.in);

        do {
            System.out.print("Adj meg egy 100-nal nagyobb szamot: ");
            szam2 = beolvaso.nextInt();
        } while (szam <= 100);

        System.out.println("A " + szam2 + " pontosan " + (szam2 - 100) + "-tel tobb mint a 100");
        beolvaso.close();

        /**
         * Palcika jatek
         */

        Random veletlenSzamGenerator = new Random();
        int i = 0;

        while (i < 10) {
            int veletlenSzam = veletlenSzamGenerator.nextInt(10);
            System.out.println(veletlenSzam);
            i++;
        }
    }
}

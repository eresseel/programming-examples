public class App {
    public static void main(String[] args) throws Exception {
        int szam = 0;

        while (true) {
            System.out.println(szam);
            szam += 13;
            if (szam > 100) {
                break;
            }
            System.out.println("Mehet tovabb...");
        }

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i == j) {
                    System.out.print("  X");
                    continue;
                }
                System.out.format("%3d", i * j);
            }
            System.out.println();
        }

        vege: for (int tizesek = 1;; tizesek++) {
            for (int egyesek = 0; egyesek <= 9; egyesek++) {
                szam = tizesek * 10 + egyesek;
                int szamJegyOsszege = tizesek + egyesek * 10 + egyesek;

                if (szamJegyOsszege % 2 == 0 || szamJegyOsszege % 3 == 0) {
                    continue;
                }

                if (szam > 99) {
                    break vege;
                }
                System.out.println(szam + " ");
            }
            System.out.println();
        }

        for (int i = 0;; i++) {
            int negyzetszam = negyzet(i);

            if (negyzetszam > 100) {
                return;
            }

            System.out.println(i + " x " + i + " = " + negyzetszam);
        }
    }

    public static int negyzet(int szam) {
        int eredmeny = szam * szam;
        return eredmeny;
    }
}

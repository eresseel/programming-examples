package v02.jarmuvek;

public class App {
    public static void main(String[] args) throws Exception {
        Gepjarmu trabant = new Gepjarmu("trabant");
        Gepjarmu lada = new Gepjarmu("Lada");

        if (trabant == lada) {
            System.out.println("Mindket jarmu ugyanaz");
        } else {
            System.out.println(trabant);
            System.out.println(lada);
            System.out.println("A ket jarmu kulonbozik");
        }

        System.out.println("1. " + trabant.allapot());
        System.out.println("1. " + lada.allapot());

        trabant.gyorsits();
        System.out.println("2. " + trabant.allapot());

        trabant.indits();
        trabant.gyorsits();
        System.out.println("3. " + trabant.allapot());

        trabant.lassits(100);
        System.out.println("4. " + trabant.allapot());
    }
}

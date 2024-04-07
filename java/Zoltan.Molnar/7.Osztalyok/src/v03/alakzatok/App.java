package v03.alakzatok;

public class App {
    public static void main(String[] args) throws Exception {
        int nagyitasAranya = 2;
        int egyikTeglalapSorszama = 1, masikTeglalapSorszama = 2;
        Teglalap egyikTeglalap = new Teglalap(20, 50);
        Teglalap masikTeglalap = new Teglalap(egyikTeglalap);

        kiirat(egyikTeglalapSorszama, egyikTeglalap);
        kiirat(masikTeglalapSorszama, masikTeglalap);

        nagyit(egyikTeglalap, nagyitasAranya);
        System.out.println("Nagyitas utan:");
        kiirat(egyikTeglalapSorszama, egyikTeglalap);
        kiirat(masikTeglalapSorszama, masikTeglalap);
    }

    public static void kiirat(int sorszam, Teglalap teglalap) {
        System.out.println(sorszam + ".) [" + teglalap.egyikOldal + ", " + teglalap.masikOldal + "]");
    }

    public static void nagyit(Teglalap teglalap, int szorzo) {
        teglalap.egyikOldal = teglalap.egyikOldal * szorzo;
        teglalap.masikOldal = teglalap.masikOldal * szorzo;
    }
}

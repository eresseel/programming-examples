import pontok.Pont;
import pontok.SikPont;
import pontok.TerPont;
import sikidomok.Sikidom;
import sikidomok.Haromszog;
import sikidomok.Teglalap;

public class IdomokMain {
    public static void main(String[] args) throws Exception {
        Pont a = new SikPont(0, 0);
        Pont b = new SikPont(0, 3);
        Pont c = new SikPont(4, 0);
        Pont d = new SikPont(4, 3);
        Pont e = new SikPont(2, 4);
        // TerPont f = new TerPont(0, 5, 3);

        Haromszog haromszog = new Haromszog(a, b, c);
        // System.out.println("a - f tavolsag: " + a.tavolsag(f)); // ez igy hibas
        System.out.println(haromszog.terulet());

        Haromszog derekszoguHaromszog = new Haromszog(a, b, c);
        System.out.println("Derek: " + derekszoguHaromszog.terulet());

        Teglalap teglalap = new Teglalap(a, b, c, d);
        System.out.println("Tegla: " + teglalap.terulet());

        Haromszog altalanosHaromszog = new Haromszog(a, e, c);
        System.out.println("Altalanos: " + altalanosHaromszog.terulet());

        Sikidom[] ketHaromszogEsEgyTeglalap = { derekszoguHaromszog, teglalap, altalanosHaromszog };
        System.out.println("Legnagyobb: " + legnagyobbTeruletu(ketHaromszogEsEgyTeglalap));

    }

    public static Sikidom legnagyobbTeruletu(Sikidom[] sikidomok) {
        if (sikidomok.length == 0) {
            return null;
        }

        Sikidom legnagyobb = sikidomok[0];

        for (int i = 1; i < sikidomok.length; i++) {
            if (sikidomok[i].terulet() > legnagyobb.terulet()) {
                legnagyobb = sikidomok[i];
            }
        }

        return legnagyobb;
    }
}

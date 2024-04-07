package extra;

public class MindenttudoKlima implements Klima {
    private static final double MINIMALIS_HOMERSEKLET = 18.0;
    private double eszleltHomerseklet;
    private double celHomerseklet;

    public MindenttudoKlima(double celhomerseklet) {
        this.celHomerseklet = celhomerseklet;
        this.eszleltHomerseklet = mertHomerseklet();
    }

    @Override
    public void csokkentsHomersekletet(double delta) {
        if (lehetTovabbCsokkenteni(celHomerseklet, delta)) {
            celHomerseklet -= delta;
            bekapcsol();
        }
    }

    @Override
    public void noveljHomersekletet(double delta) {
        celHomerseklet += delta;
        bekapcsol();
    }

    @Override
    public boolean lehetTovabbCsokkenteni(double aktualisHomerseklet, double delta) {
        return aktualisHomerseklet - delta >= MINIMALIS_HOMERSEKLET;
    }

    public void bekapcsol() {
        if (celHomerseklet != eszleltHomerseklet) {

        }
    }

    @Override
    public String toString() {
        return "A mindenttudo klima " + celHomerseklet + " C-ra van beallitva";
    }

    private double mertHomerseklet() {
        return 24.0;
    }
}

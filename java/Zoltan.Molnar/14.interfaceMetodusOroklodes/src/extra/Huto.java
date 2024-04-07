package extra;

public class Huto implements Hutokepes {
    private double homerseklet;

    public Huto(double kezdetiHomerseklet) {
        this.homerseklet = kezdetiHomerseklet;
    }

    @Override
    public void csokkentsHomersekletet(double delta) {
        if (lehetTovabbCsokkenteni(homerseklet, delta)) {
            homerseklet -= delta;
        }
    }

    @Override
    public String toString() {
        return "A huto belsejeben " + homerseklet + " C van";
    }
}

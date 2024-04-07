package extra;

public interface Hutokepes {
    public static final double ABSZOLUT_NULLA_CELSIUSBAN = -273.15;

    public void csokkentsHomersekletet(double delta);

    // a default miatt nem kotelezo felulirni, implementalni
    public default boolean lehetTovabbCsokkenteni(double aktualisHomerseklet, double delta) {
        return aktualisHomerseklet - delta > ABSZOLUT_NULLA_CELSIUSBAN;
    }

    public static double fahrenheitCelsiusba(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}

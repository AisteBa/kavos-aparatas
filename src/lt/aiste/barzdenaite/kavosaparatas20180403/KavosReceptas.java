package lt.aiste.barzdenaite.kavosaparatas20180403;

public class KavosReceptas {

    public static final KavosReceptas WEAK_COFFEE = new KavosReceptas(5, 2, 300);
    public static final KavosReceptas MEDIUM_COFFEE = new KavosReceptas(5, 4, 500);
    public static final KavosReceptas STRONG_COFFEE = new KavosReceptas(5, 6, 500);

    public static final String WEAK_COFFEE_INPUT = "w";
    public static final String MEDIUM_COFFEE_INPUT = "m";
    public static final String STRONG_COFFEE_INPUT = "s";

    private int cukrausKiekisPuodelyje; // gramai
    private int pupeliuKiekisPuodelyje; // gramai
    private int vandensKiekisPuodelyje;  // miligramai

    public KavosReceptas(int cukrausKiekisPuodelyje, int pupeliuKiekisPuodelyje, int vandensKiekisPuodelyje) {
        this.cukrausKiekisPuodelyje = cukrausKiekisPuodelyje;
        this.pupeliuKiekisPuodelyje = pupeliuKiekisPuodelyje;
        this.vandensKiekisPuodelyje = vandensKiekisPuodelyje;
    }

    public int getCukrausKiekisPuodelyje() {
        return cukrausKiekisPuodelyje;
    }

    public void setCukrausKiekisPuodelyje(int cukrausKiekisPuodelyje) {
        this.cukrausKiekisPuodelyje = cukrausKiekisPuodelyje;
    }

    public int getPupeliuKiekisPuodelyje() {
        return pupeliuKiekisPuodelyje;
    }

    public void setPupeliuKiekisPuodelyje(int pupeliuKiekisPuodelyje) {
        this.pupeliuKiekisPuodelyje = pupeliuKiekisPuodelyje;
    }

    public int getVandensKiekisPuodelyje() {
        return vandensKiekisPuodelyje;
    }

    public void setVandensKiekisPuodelyje(int vandensKiekisPuodelyje) {
        this.vandensKiekisPuodelyje = vandensKiekisPuodelyje;
    }

    public static KavosReceptas kavosReceptas(String typeOfCoffee) {
        if (WEAK_COFFEE_INPUT.equals(typeOfCoffee)) {
            return KavosReceptas.WEAK_COFFEE;
        } else if (MEDIUM_COFFEE_INPUT.equals(typeOfCoffee)) {
            return KavosReceptas.MEDIUM_COFFEE;
        } else if (STRONG_COFFEE_INPUT.equals(typeOfCoffee)) {
            return KavosReceptas.STRONG_COFFEE;
        } else {
            return null;
        }
    }


}

package lt.aiste.barzdenaite.kavosaparatas20180403;

public class KavosAparatas {
    public static final int PANAUDOJIMU_SKAICIAUS_RIBA = 50;

    public static final int MAX_CUKRAUS_KIEKIS = 500;  // gramai
    public static final int MAX_KAVOS_PUPELIU_KIEKIS = 5; // gramai
    public static final int MAX_VANDENS_KIEKIS = 5000;  // miligramai

    private int cukrausKiekis;  // gramai
    private int kavosPupeliuKiekis; // gramai
    private int vandensKiekis;  // miligramai
    private int panaudojimuSkaicius;

    public KavosAparatas(){
       this(MAX_CUKRAUS_KIEKIS, MAX_KAVOS_PUPELIU_KIEKIS, MAX_VANDENS_KIEKIS);
    }

    public KavosAparatas(int cukrausKiekis, int kavosPupeliuKiekis, int vandensKiekis) {
        this.cukrausKiekis = cukrausKiekis;
        this.kavosPupeliuKiekis = kavosPupeliuKiekis;
        this.vandensKiekis = vandensKiekis;
    }

    public boolean patikrink(String typeOfCoffee) {
        return patikrinkPuodelyje(KavosReceptas.kavosReceptas(typeOfCoffee));
    }

    public boolean patikrinkPuodelyje(KavosReceptas kavosReceptas) {
        return (cukrausKiekis >= kavosReceptas.getCukrausKiekisPuodelyje() &&
            kavosPupeliuKiekis >= kavosReceptas.getPupeliuKiekisPuodelyje() &&
            vandensKiekis >= kavosReceptas.getVandensKiekisPuodelyje() &&
            (PANAUDOJIMU_SKAICIAUS_RIBA - this.panaudojimuSkaicius) > 0);
    }

    public void spausdinkArPasiruoses() {
        if (cukrausKiekis < KavosReceptas.WEAK_COFFEE.getCukrausKiekisPuodelyje()) {
            System.out.println("Papildykite cukraus");
        } else if (kavosPupeliuKiekis < KavosReceptas.WEAK_COFFEE.getPupeliuKiekisPuodelyje()) {
            System.out.println("Papildykite pupelių");
        } else if (vandensKiekis < KavosReceptas.WEAK_COFFEE.getVandensKiekisPuodelyje()) {
            System.out.println("Papildykite vandens");
        } else if ((PANAUDOJIMU_SKAICIAUS_RIBA - this.panaudojimuSkaicius) <= 0) {
            System.out.println("Išplaukite aparatą");
        } else {
            System.out.println("Aparatas pasiruošęs daryti kavą");
        }
    }

    public void ruoskKava(String typeOfCoffee) {
            ruostiKavosPuodeli(KavosReceptas.kavosReceptas(typeOfCoffee));
    }

    public void ruostiKavosPuodeli(KavosReceptas kavosReceptas){
        if(this.patikrinkPuodelyje(kavosReceptas)) {
            this.cukrausKiekis = this.cukrausKiekis - kavosReceptas.getCukrausKiekisPuodelyje();
            this.vandensKiekis = this.vandensKiekis - kavosReceptas.getVandensKiekisPuodelyje();
            this.kavosPupeliuKiekis = this.kavosPupeliuKiekis - kavosReceptas.getPupeliuKiekisPuodelyje();
        }
    }

    public void skaiciuokPanaudojimuSkaiciu() {
        this.panaudojimuSkaicius = this.panaudojimuSkaicius + 1;
    }

    public void isplaukAparata() {
        this.panaudojimuSkaicius = 0;
    }

    public int papildytiVandens() {
        this.vandensKiekis = MAX_VANDENS_KIEKIS;
        return vandensKiekis;
    }

    public int papildytiPupeliu() {
        this.kavosPupeliuKiekis = MAX_KAVOS_PUPELIU_KIEKIS;
        return kavosPupeliuKiekis;
    }

    public int papildytiCukraus() {
        this.cukrausKiekis = this.MAX_CUKRAUS_KIEKIS;
        return cukrausKiekis;
    }

    public void papildytiIkiMax() {
        this.papildytiCukraus();
        this.papildytiPupeliu();
        this.papildytiVandens();
        this.isplaukAparata();
    }

    public int getCukrausKiekis() {
        return cukrausKiekis;
    }

    public int getKavosPupeliuKiekis() {
        return kavosPupeliuKiekis;
    }

    public int getVandensKiekis() {
        return vandensKiekis;
    }

    public int getPanaudojimuSkaicius() {
        return panaudojimuSkaicius;
    }

}

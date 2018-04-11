package lt.aiste.barzdenaite.kavosaparatas20180403;

public class KavosAparatas {
    public static final int PANAUDOJIMU_SKAICIAUS_RIBA = 2;
    public static final String WEAK_COFFEE = "w";
    public static final String MEDIUM_COFFEE = "m";
    public static final String STRONG_COFFEE = "s";
    public static final int MAX_CUKRAUS_KIEKIS = 10;  // gramai
    private int maxKavosPupeliuKiekis; // gramai
    private int maxVandensKiekis;  // miligramai

    private int cukrausKiekis;  // gramai
    private int kavosPupeliuKiekis; // gramai
    private int vandensKiekis;  // miligramai
    private int panaudojimuSkaicius;

    public KavosAparatas(){
        this.cukrausKiekis = MAX_CUKRAUS_KIEKIS;
    }

    public KavosAparatas(int cukrausKiekis, int kavosPupeliuKiekis, int vandensKiekis) {
        this.cukrausKiekis = cukrausKiekis;
        this.maxKavosPupeliuKiekis = this.kavosPupeliuKiekis = kavosPupeliuKiekis;
        this.maxVandensKiekis = this.vandensKiekis = vandensKiekis;
    }

    public boolean patikrink() {
        if (cukrausKiekis < 5 && kavosPupeliuKiekis < 6 && vandensKiekis < 500 && (PANAUDOJIMU_SKAICIAUS_RIBA - this.panaudojimuSkaicius) <= 0) {
            return false;
        } else {
        return true;
        }
    }

    public void spausdinkArPasiruoses() {
        if (cukrausKiekis < 5) {
            System.out.println("Papildyti cukraus");
        }
        if (kavosPupeliuKiekis < 6) {
            System.out.println("Papildyti pupelių");
        }
        if (vandensKiekis < 500) {
            System.out.println("Papildyti vandens");
        }
        if ((PANAUDOJIMU_SKAICIAUS_RIBA - this.panaudojimuSkaicius) <= 0) {
            System.out.println("Išplauti aparatą");
        } else {
            System.out.println("Aparatas pasiruošęs daryti kavą");
        }
    }

    /*silpna kava = 300 vandens, 5 cukraus, 2 pupeliu;
    vidutine = 500 vandens, 5 cukraus, 4 pupeliu;
    stipri = 500 vandens, 5 cukraus,  6 pupeliu */
    public void ruoskKava(String typeOfCoffee) {
        if (WEAK_COFFEE.equals(typeOfCoffee)) {
            this.cukrausKiekis = this.cukrausKiekis - 5;
            this.vandensKiekis = this.vandensKiekis - 300;
            this.kavosPupeliuKiekis = this.kavosPupeliuKiekis - 2;
        }
        if (MEDIUM_COFFEE.equals(typeOfCoffee)) {
            this.cukrausKiekis = this.cukrausKiekis - 5;
            this.vandensKiekis = this.vandensKiekis - 500;
            this.kavosPupeliuKiekis = this.kavosPupeliuKiekis - 4;
        }
        if (STRONG_COFFEE.equals(typeOfCoffee)) {
            this.cukrausKiekis = this.cukrausKiekis - 5;
            this.vandensKiekis = this.vandensKiekis - 500;
            this.kavosPupeliuKiekis = this.kavosPupeliuKiekis - 6;
        }
    }

    public void skaiciuokPanaudojimuSkaiciu() {
        this.panaudojimuSkaicius = this.panaudojimuSkaicius + 1;
    }

    public void isplaukAparata() {
        this.panaudojimuSkaicius = 0;
    }

    public int papildytiVandens() {
        this.vandensKiekis = this.maxVandensKiekis;
        return vandensKiekis;
    }

    public int papildytiPupeliu() {
        this.kavosPupeliuKiekis = this.maxKavosPupeliuKiekis;
        return kavosPupeliuKiekis;
    }

    public int papildytiCukraus() {
        this.cukrausKiekis = this.MAX_CUKRAUS_KIEKIS;
        return cukrausKiekis;
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

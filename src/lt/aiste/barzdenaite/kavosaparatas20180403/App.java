package lt.aiste.barzdenaite.kavosaparatas20180403;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//Sukurti kavos aparatą:
//Kuris turėtų atributus:
//Cukraus kiekis
//Kavos pupelių kiekis
//Vandens kiekis
//Panaudojimų skaičius
//Panaudojimų skaičiaus riba – konstanta, kuri saugo, kas kiek panaudojimų reikia atlikti plovimą
//Kuris mokėtų:
//Papildyti vandens/pupelių/cukraus
//Gaminti bent trijų rūšių kavą (nustatoma pagal String parametrą ir kuri naudotų skirtingus produktų kiekius),
// jeigu trūksta nors vieno produkto 0 atspausdintų atitinkamą pranešimą; Taip pat atspausditų pranešimą jeigu laikas plovimui
//Atlikti plovimą (apnulina panaudojimų skaičių)
//Pasakyti ar pasiruošęs (netrūksta produktų ir išsivalęs)
//Pasakytų kokia dabar produktų būsena – atspausdintų informaciją
//Pasakytų kokia yra aparato būsena (kiek liko produktų ir iki plovimo)

        KavosAparatas kA = new KavosAparatas();

        boolean run = true;
        while (run) {
            spausdinkMenu();
            kA.spausdinkArPasiruoses();
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Pasirinkite kavą: silpa (w), vidutinio stiprumo (m), stirpi (s)");
                    String typeOfCoffee = scanner.next().toLowerCase();
                    if(kA.patikrink(typeOfCoffee)) {
                        kA.ruoskKava(typeOfCoffee);
                        kA.skaiciuokPanaudojimuSkaiciu();
                        System.out.println("Kava paruošta!");
                    } else {
                        System.out.println("Pirmiausia papildykite/išplaukite aparatą");
                    }
                    break;
                case 2:
                    kA.spausdinkArPasiruoses();
                    break;
                case 3:
                    System.out.println("Kuo norėsite papildyti aparatą: 1. vandeniu 2. pupelėmis 3. cukrumi ");
                    int papildymas = scanner.nextInt();
                    switch (papildymas){
                        case 1:
                        kA.papildytiVandens();
                        System.out.println("Papildyta vandens");
                        break;
                        case 2:
                        kA.papildytiPupeliu();
                        System.out.println("Papildyta pupelių");
                        break;
                        case 3:
                        kA.papildytiCukraus();
                        System.out.println("Papildyta cukraus");
                        break;
                        case 4:
                        kA.papildytiIkiMax();
                        System.out.println("Papildyta viskuom iki max");
                        break;
                        default:
                            System.out.println("Blogai įvestas skaičius");
                    }
                    break;
                case 4:
                    kA.isplaukAparata();
                    System.out.println("Aparatas išplautas");
                    break;
                case 5:
                    System.out.println("Cukraus kiekis: " + kA.getCukrausKiekis() + " gramų");
                    System.out.println("Kavos pupelių kiekis: " + kA.getKavosPupeliuKiekis() + " gramų");
                    System.out.println("Vandens kiekis: " + kA.getVandensKiekis() + " miligramų");
                    break;
                case 6:
                    System.out.println("Iki plovimo liko " + (KavosAparatas.PANAUDOJIMU_SKAICIAUS_RIBA - kA.getPanaudojimuSkaicius()) + " puodelių");
                    break;
                case 7:
                    System.out.println("Aparatas išjungtas");
                    run = false;
                    break;
                default:
                    System.out.println("Įvestas netinkamas skaičius, įveskite skaičių nuo 1 iki 6");
                    break;
            }
        }
    }
    public static void spausdinkMenu() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Pasirinkite, ką norite daryti:");
        System.out.println("1. Gaminti kavą");
        System.out.println("2. Patikrinti, ar aparatas pasiruošęs daryti kavą");
        System.out.println("3. Papildyti aparatą vandeniu, pupelėmis, cukrumi");
        System.out.println("4. Atlikti aparato plovimą");
        System.out.println("5. Produktų būsena");
        System.out.println("6. Aparato būsena");
        System.out.println("7. Išjungti aparatą");
        System.out.println("-------------------------------------------------------");
    }
}

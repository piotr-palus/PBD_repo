import java.util.Random;

public class Main
{
    private static final int RZADKOSC_LIMIT = 10;
    private static final int ATAK_LIMIT = 10;
    private static final int SZYBKOSC_ATAKU_LIMIT = 4;
    private static final int WYTRZYMALOSC_LIMIT = 100;
    private static final int WYMAGANY_POZIOM_LIMIT = 20;
    private static final int HP_LIMIT = 100;
    private static final int KLASA_PANCERZA_LIMIT = 5;
    private static final int CZAS_DZIALANIA_LIMIT = 24;
    private static final int POJEMNOSC_LIMIT = 100;

    public static void main(String[] args)
    {
        DataBase dataBase = new DataBase();
        Kontener kontener = new Kontener();
        Random random = new Random();

        // ATUT
        String[] atuty = kontener.getAtuty();
        for (int i = 0; i < atuty.length; i++) {
            dataBase.dodajAtut(atuty[i], random.nextInt(WYMAGANY_POZIOM_LIMIT) + 1);
        }

        // INWENTARZ
        for (int i = 0; i < 300; i++) {
            dataBase.dodajInwentarz();
        }

        // KLASA
        String[] klasy = kontener.getKlasy();
        for (int i = 0; i < klasy.length; i++) {
            dataBase.dodajKlase(klasy[i], random.nextInt(WYMAGANY_POZIOM_LIMIT) + 1);
        }

        // MAGICZNY_EKWIPUNEK
        MagicznyEkwipunek me;
        for (int i = 0; i < 70; i++) {
            me = new MagicznyEkwipunek();
            dataBase.dodajMagicznyEkwipunek(me);
        }

        // MAJĄTEK
        String[] majatki = kontener.getMajatki();
        String[] rodzaje_majatku = kontener.getRodzaj_majatku();
        for (int i = 0; i < majatki.length; i++) {
            dataBase.dodajMajatek(majatki[i], rodzaje_majatku[random.nextInt(3)], random.nextInt(10000));
        }

        // MIKSTURA
        String[] mikstury = kontener.getMikstury();
        for (int i = 0; i < mikstury.length; i++) {
            dataBase.dodajMiksture(mikstury[i], random.nextInt(POJEMNOSC_LIMIT) + 1, random.nextInt(CZAS_DZIALANIA_LIMIT) + 1);
        }

        // RASA
        String[] rasy = kontener.getRasy();
        for (int i = 0; i < rasy.length; i++) {
            dataBase.dodajRase(rasy[i]);
        }

        // UMIEJĘTNOSC
        String[] umiejetnosci = kontener.getUmiejetnosci();
        for (int i = 0; i < umiejetnosci.length; i++) {
            dataBase.dodajUmiejetnosci(umiejetnosci[i], random.nextInt(WYMAGANY_POZIOM_LIMIT) + 1, "");
        }

        // ZWOJ
        String[] zwoje = kontener.getZwoje();
        for (int i = 0; i < zwoje.length; i++) {
            dataBase.dodajZwoje(zwoje[i], "", random.nextInt(CZAS_DZIALANIA_LIMIT) + 1);
        }

        // CHARAKTER
        String[] moralnosci = kontener.getMoralnosci();
        String[] personalnosci = kontener.getPersonalnosci();
        for (int i = 0; i < moralnosci.length; i++) {
            for (int j = 0; j < personalnosci.length; i++) {
                dataBase.dodajCharakter(moralnosci[i], personalnosci[j]);
            }
        }

        // POSTAC
        GeneratorImion gi = new GeneratorImion();
        gi.wypelnij();
        Postac postac;
        for (int i = 0; i < 800; i++) {
            postac = new Postac(gi.stworzImie(), moralnosci.length, rasy.length, klasy.length, 300);
            dataBase.dodajPostac(postac);
        }

        // CZAR
        String[] czary = kontener.getCzary_0();
        for (int i = 0; i < czary.length; i++) {
            dataBase.dodajCzar(czary[i],
                    random.nextInt(WYMAGANY_POZIOM_LIMIT) + 1,
                    random.nextInt(WYMAGANY_POZIOM_LIMIT) + 1,
                    random.nextInt(10000) + 1,
                    random.nextInt(10000) + 1,
                    random.nextInt(WYMAGANY_POZIOM_LIMIT) + 1);
        }


        // TYP CZESCI CIALA
        String[] tcc = kontener.getTypyCzesciCiala();
        for (int i = 0; i < tcc.length; i++) {
            dataBase.dodajTypCzesciCiala(tcc[i]);
        }

        // CZESC CIALA
        String[] cc = kontener.getCzesci_ciala();
        for (int i = 0; i < cc.length; i++) {
            dataBase.dodajCzescCiala(cc[i], HP_LIMIT);
        }

        // BRON
        String[] bronie = kontener.getBronie();
        for (int i = 0; i < bronie.length; i++) {
            dataBase.dodajBron(bronie[i], random.nextInt(RZADKOSC_LIMIT) + 1, random.nextInt(ATAK_LIMIT) + 1,
                    random.nextInt(SZYBKOSC_ATAKU_LIMIT), random.nextInt(WYTRZYMALOSC_LIMIT) + 1);
        }

        // ZBROJA
        String[] zbroje = kontener.getZbroje();
        for (int i = 0; i < zbroje.length; i++) {
            dataBase.dodajZbroje(zbroje[i],
                    random.nextInt(RZADKOSC_LIMIT) + 1,
                    random.nextInt(KLASA_PANCERZA_LIMIT) + 1,
                    random.nextInt(WYTRZYMALOSC_LIMIT) + 1,
                    random.nextInt(cc.length) + 1);
        }

        // TYP ZBROI
        String[] typy_zbroi = kontener.getTypyZbroi();
        for (int i = 0; i < typy_zbroi.length; i++) {
            dataBase.dodajTypZbroi(typy_zbroi[i], random.nextInt(zbroje.length) + 1);
        }

        // TYP BRONI
        String[] typy_broni = kontener.getTypyBroni();
        for (int i = 0; i < typy_broni.length; i++) {
            dataBase.dodajTypBroni(typy_broni[i], random.nextInt(bronie.length) + 1);
        }

        // KONFIGURACJA BRONI
        for (int i = 0; i < typy_broni.length; i++) {
            dataBase.dodajKonfiguracjeBroni(i + 1, random.nextInt(tcc.length) + 1);
        }

        // KONFIGURACJA ZBROI
        for (int i = 0; i < typy_zbroi.length; i++) {
            dataBase.dodajKonfiguracjeZbroi(i + 1, random.nextInt(tcc.length) + 1);
        }

        // UMIEJETNOSCI RAS
        for (int i = 0; i < rasy.length + 10; i++) {
            dataBase.dodajUmiejetnosciRas(random.nextInt(rasy.length) + 1, random.nextInt(umiejetnosci.length) + 1);
        }

        // UMIEJETNOSCI POSTACI
        for (int i = 0; i < 1000; i++) {
            dataBase.dodajUmiejetnosciPostaci(random.nextInt(800) + 1, random.nextInt(umiejetnosci.length) + 1);
        }

        // UMIEJETNOSCI KLASY
        for (int i = 0; i < klasy.length + 20; i++) {
            dataBase.dodajUmiejetnosciKlasy(random.nextInt(umiejetnosci.length) + 1, random.nextInt(klasy.length) + 1);
        }

        // ATUTY KLASY
        for (int i = 0; i < klasy.length + 5; i++) {
            dataBase.dodajAtutKlasy(random.nextInt(atuty.length) + 1, random.nextInt(klasy.length) + 1);
        }

        // ATUTY POSTACI
        for (int i = 0; i < 1000; i++) {
            dataBase.dodajAtutPostaci(random.nextInt(800) + 1, random.nextInt(atuty.length) + 1);
        }

        // CZARY KlASY
        for (int i = 0; i < klasy.length; i++) {
            dataBase.dodajCzarKlasy(random.nextInt(klasy.length) + 1, random.nextInt(czary.length) + 1);
        }

        // ZWOJE W INWENTARZU
        for (int i = 0; i < 300; i++) {
            dataBase.dodajZwojDoInwentarza(i + 1, random.nextInt(zwoje.length) + 1);
        }

        // MIKSTURY W INWENTARZU
        for (int i = 0; i < 300; i++) {
            dataBase.dodajMikstureDoInwentarza(i + 1, random.nextInt(mikstury.length) + 1);
        }

        // MAJATEK W INWENTARZU
        for (int i = 0; i < 300; i++) {
            dataBase.dodajMajatekDoInwentarza(i + 1, random.nextInt(majatki.length) + 1);
        }

        // MAGICZNY EKWIPUNEK W INWENTARZU
        for (int i = 0; i < 300; i++) {
            dataBase.dodajMagicznyEkwipunekDoInwentarza(i + 1, random.nextInt(70) + 1);
        }

    }
}

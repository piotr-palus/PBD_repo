
public class Postac {

	String imie_p;
	int wzrost;
	int waga;
	String kolor_oczu;
	String kolor_wlosow;
	String karnacja;
	int poziom;
	int sila;
	int zrecznosc;
	int roztropnosc;
	int inteligencja;
	int budowa;
	int charyzma;
	String historia;
	int zycie;
	int id_char;
	int id_rs;
	int id_kl;
	int id_inw;
	
	String[] kolory_oczu= {"niebieskie", "zielone", "br¹zowe", "piwne", "szare", "ciemnobr¹zowe", "bursztynowe", "czerwone"};
	String[] kolory_wlosow = {"czarne", "br¹zowe", "blond", "ciemny blond", "czerwone", "bia³e", "zielone", "rude"};
	String[] karnacje = {"ciemna", "jasna", "¿ó³ta", "zielona", "szara"};
	int ko = kolory_oczu.length;
	int kw = kolory_wlosow.length;
	int kar = karnacje.length;
	
	
	public Postac(String imie, int il_char, int il_ras, int il_klas, int il_inwentarzy){
		imie_p = imie;
		wzrost = (int)(Math.random()*250);
		waga = (int)(Math.random()*200);
		kolor_oczu = kolory_oczu[(int)(Math.random()*ko)];
		kolor_wlosow = kolory_wlosow[(int)(Math.random()*kw)];
		karnacja = karnacje[(int)(Math.random()*kar)];
		poziom = (int)(Math.random()*30);
		sila = (int)(Math.random()*30);
		zrecznosc = (int)(Math.random()*30);
		roztropnosc = (int)(Math.random()*30);
		inteligencja = (int)(Math.random()*30);
		budowa = (int)(Math.random()*30);
		charyzma = (int)(Math.random()*30);
		historia = "";
		zycie = (int)(Math.random()*100) + 1;
		id_char = (int)(Math.random()*il_char);
		id_rs = (int)(Math.random()*il_ras);
		id_kl = (int)(Math.random()*il_klas);
		id_inw = (int)(Math.random()*il_inwentarzy);
	}
	
}


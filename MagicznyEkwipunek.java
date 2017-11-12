
public class MagicznyEkwipunek {

	String nazwa;
	int b_zycia;
	int b_mana;
	int b_sila;
	int b_zrecznosc;
	int b_roztropnosc;
	int b_budowa;
	int b_charyzma;
	int b_inteligencja;
	String opis;
	
	String[] przedmioty = {"Buty", "Napierœnik", "Pierœcieñ", "Kolczyk", "Sztylet", "Medalion"};
	String[] atuty = {"¯ycia", "Roztropnoœci", "Charyzmy", "Niewidzilnoœci", "Zrêcznoœci", "Budowy", "Many", "Si³y", "Inteligencji"};
	int przed = przedmioty.length;
	int at = atuty.length;
	String atut;
	
	public MagicznyEkwipunek(){
		atut = atuty[(int)(Math.random()*at)];
		nazwa = przedmioty[(int)(Math.random()*przed)] + " " + atut;
		b_zycia = 0;
		b_mana = 0;
		b_sila = 0;
		b_zrecznosc = 0;
		b_roztropnosc = 0;
		b_budowa = 0;
		b_charyzma = 0;
		b_inteligencja = 0;
		opis = "";
		if (atut.equals("¯ycia")){
			b_zycia = (int)(Math.random()*5) + 5;
		}
		if (atut.equals("Roztropnoœci")){
			b_roztropnosc = (int)(Math.random()*5)+1;
		}
		if (atut.equals("Charyzmy")){
			b_charyzma = (int)(Math.random()*5)+1;
		}
		if (atut.equals("Zrêcznoœci")){
			b_zrecznosc = (int)(Math.random()*5)+1;
		}
		if (atut.equals("Budowy")){
			b_budowa = (int)(Math.random()*5)+1;
		}
		if (atut.equals("Many")){
			b_mana = (int)(Math.random()*5)+1;
		}
		if (atut.equals("Si³y")){
			b_sila = (int)(Math.random()*5)+1;
		}
		if (atut.equals("Inteligencji")){
			b_inteligencja = (int)(Math.random()*5)+1;
		}
	}

	/*
	public static void main(String[] args){
		MagicznyEkwipunek me = new MagicznyEkwipunek(1);
		System.out.println(me.nazwa);
		System.out.println(me.b_zycia);
		System.out.println(me.b_roztropnosc);
		System.out.println(me.b_charyzma);
		System.out.println(me.b_zrecznosc);
		System.out.println(me.b_budowa);
		System.out.println(me.b_mana);
		System.out.println(me.b_sila);
		System.out.println(me.b_inteligencja);
	}
	*/
}

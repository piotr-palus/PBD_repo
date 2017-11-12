import java.util.ArrayList;

public class GeneratorImion {
	
	ArrayList<String> sylaby;
	
	public void wypelnij(){
		sylaby = new ArrayList<>();
		sylaby.add("mon");
		sylaby.add("fay");
		sylaby.add("shi");
		sylaby.add("zag");
		sylaby.add("blarg");
		sylaby.add("rash");
		sylaby.add("izen");
		sylaby.add("rigar");
		sylaby.add("xor");
		sylaby.add("lux");
		sylaby.add("drak");
		sylaby.add("izen");
		sylaby.add("der");
		sylaby.add("andi");
		sylaby.add("mer");
		sylaby.add("mel");
		sylaby.add("neo");
		sylaby.add("ort");
		sylaby.add("tom");
		sylaby.add("hard");
		sylaby.add("lar");
		sylaby.add("gal");
		sylaby.add("faos");
		sylaby.add("ajf");
		sylaby.add("ven");
		sylaby.add("sege");
		sylaby.add("hex");
		sylaby.add("mar");
		sylaby.add("got");
		sylaby.add("beth");
		sylaby.add("ayal");
		sylaby.add("sar");
		sylaby.add("bjo");
		sylaby.add("ele");
		sylaby.add("rein");
		sylaby.add("mae");
		sylaby.add("khaer");
		sylaby.add("etil");
		sylaby.add("gar");
		sylaby.add("feinr");
		sylaby.add("ber");
		sylaby.add("der");
		sylaby.add("nor");
		sylaby.add("kam");
		sylaby.add("arvi");
		sylaby.add("hor");
		sylaby.add("dar");
		sylaby.add("zie");
		sylaby.add("leg");
		sylaby.add("apo");
		sylaby.add("yar");
		sylaby.add("mor");
		sylaby.add("warr");
		sylaby.add("ili");
		sylaby.add("mot");
		sylaby.add("yann");
		sylaby.add("ghor");
		sylaby.add("gat");
		sylaby.add("han");
		sylaby.add("llaj");
		sylaby.add("erien");
		sylaby.add("rafi");
		sylaby.add("xar");
		sylaby.add("dil");
		sylaby.add("arl");
		sylaby.add("andr");
		sylaby.add("kar");
		sylaby.add("vary");
		sylaby.add("anto");
		sylaby.add("gerl");
		sylaby.add("kad");
		sylaby.add("elr");
		sylaby.add("thor");
		sylaby.add("pal");
		sylaby.add("logo");
		sylaby.add("gavi");
		sylaby.add("uri");
		sylaby.add("ashe");
		sylaby.add("zhen");
		sylaby.add("hols");
		sylaby.add("ximo");
		sylaby.add("wean");
		sylaby.add("faim");
		sylaby.add("ushi");
		sylaby.add("keis");
		sylaby.add("gour");
		sylaby.add("bur");
		sylaby.add("gorg");
		sylaby.add("bib");
		sylaby.add("dag");
		sylaby.add("ion");
		sylaby.add("onc");
		sylaby.add("ler");
		sylaby.add("gun");
		sylaby.add("ham");
		sylaby.add("iilo");
		sylaby.add("xaas");
		sylaby.add("tow");
		sylaby.add("sear");
		sylaby.add("nou");
		sylaby.add("pill");
	}

	
	public String stworzImie(){
		String imie = "";
		int dlugosc = 2 + (int)(Math.random()*2);
		int rozmiarListy = sylaby.size();
		for(int i=0; i<dlugosc; i++){
			imie += sylaby.get((int)(Math.random()*rozmiarListy));
		}
		String pierwszaLitera = "";
		pierwszaLitera = imie.substring(0, 1);
		imie = imie.substring(1);
		pierwszaLitera = pierwszaLitera.toUpperCase();
		imie = pierwszaLitera + imie;
		return imie;
	}

	
}


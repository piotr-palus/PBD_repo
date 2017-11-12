import java.util.Random;

public class Main {
    private static final int RZADKOSC_LIMIT=10;
    private static final int ATAK_LIMIT = 10;
    private static final int SZYBKOSC_ATAKU_LIMIT=4;
    private static final int WYTRZYMALOSC_LIMIT = 100;
    private static final int WYMAGANY_POZIOM_LIMIT = 20;

    public static void main (String [] args){



        DataBase dataBase  = new DataBase();
        Kontener kontener = new Kontener();
        Random random = new Random();


        String [] atuty= kontener.getAtuty();
        for(int i=0;i<atuty.length;i++)
        {
            dataBase.dodajAtut(atuty[i],random.nextInt(WYMAGANY_POZIOM_LIMIT)+1);
        }

        String [] bronie = kontener.getBronie();
        for(int i=0;i<bronie.length;i++)
        {
            dataBase.dodajBron(bronie[i],random.nextInt(RZADKOSC_LIMIT)+1,random.nextInt(ATAK_LIMIT)+1,
                    random.nextInt(SZYBKOSC_ATAKU_LIMIT),random.nextInt(WYTRZYMALOSC_LIMIT)+1);
        }



    }
}

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.*;
import java.sql.*;

public class DataBase
{
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "Qazxsw2!";


        /**
         * Displays the data base
         */
        public void displayDB()
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        conn = DriverManager.getConnection(url, user, password);

                        Statement st = conn.createStatement();
                        String query = "SELECT * FROM generator_postaci_rpg1.klasa";
                        ResultSet rs = st.executeQuery(query);
                        ResultSetMetaData rsmd = rs.getMetaData();
                        System.out.println(rsmd);

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }


        public void dodajAtut(String nazwa_atutu, int wymagany_poziom)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.atut (Nazwa_AT,Wymagany_Poziom_AT) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);


                        pst.setString(1, nazwa_atutu);
                        pst.setInt(2, wymagany_poziom);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }


        public void dodajAtutKlasy(int id_atutu, int id_klasy)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.atuty_klasy (ID_AT,ID_KL) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_atutu);
                        pst.setInt(2, id_klasy);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }


        public void dodajAtutPostaci(int id_postaci, int id_atutu)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.atuty_postaci (ID_P,ID_AT) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_postaci);
                        pst.setInt(2, id_atutu);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajBron(String nazwa_broni, int rzadkość, int atak, int szybkość_ataku, int wytrzymałość)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.broń (Nazwa_B,Rzadkość_B,Atak_B,Szybkość_ataku_B," +
                                "Wytrzymałość_B) VALUES(?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);


                        pst.setString(1, nazwa_broni );
                        pst.setInt(2,rzadkość);
                        pst.setInt(3,atak );
                        pst.setInt(4,szybkość_ataku );
                        pst.setInt(5, wytrzymałość);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajCharakter(String moralnosc, String personalnosc)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.charakter (Moralność_CHAR, Personalność_CHAR) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);


                        pst.setString(1, moralnosc );
                        pst.setString(2, personalnosc );

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }



        public void dodajCzar(String nazwa, int wymagany_poziom, int wymagany_poziom_klasy, int kosztHP, int kosztMP, int ranga)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.czar (Nazwa_CZ, Wymagany_poziom_CZ, Wymagany_poziom_klasy_CZ," +
                                "Koszt_many_CZ, Koszt_życia_CZ, Ranga_CZ) VALUES(?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);


                        pst.setString(1, nazwa );
                        pst.setInt(2, wymagany_poziom  );
                        pst.setInt(3, wymagany_poziom_klasy);
                        pst.setInt(4, kosztMP );
                        pst.setInt(5, kosztHP);
                        pst.setInt(6, ranga );

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajCzarKlasy(int id_klasy, int id_czaru)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.czary_klasy (ID_KL,ID_CZ) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_klasy);
                        pst.setInt(2, id_czaru);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajCzescCiala(String nazwa, int HP)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.część_ciała (Nazwa_CC, Punkty_Życia_CC) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);


                        pst.setString(1, nazwa);
                        pst.setInt(2, HP );

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajInwentarz()
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.inwentarz () VALUES()";
                        pst = conn.prepareStatement(sql);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajKlase(String nazwa, int poziom_klasy)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.klasa (Nazwa_KL, Poziom_KL) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);


                        pst.setString(1, nazwa);
                        pst.setInt(2, poziom_klasy );

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajKonfiguracjeBroni(int id_typu_broni, int id_typu_cz_ciala)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.konfiguracja_broni (ID_TB,ID_TCC) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_typu_broni);
                        pst.setInt(2, id_typu_cz_ciala);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }


        public void dodajKonfiguracjeZbroi(int id_typu_zbroi, int id_typu_cz_ciala)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.konfiguracja_zbroi (ID_TZB,ID_TCC) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_typu_zbroi);
                        pst.setInt(2, id_typu_cz_ciala);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajMagicznyEkwipunek(MagicznyEkwipunek me)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.magiczny_ekwipunek (Nazwa_ME,Bonus_Życia_ME,Bonus_Mana_ME,Bonus_Siła_ME,Bonus_Zręczność_ME,Bonus_Roztropność_ME,Bonus_Budowa_ME,Bonus_Charyzma_ME,Bonus_Inteligencja_ME,Opis_działania_ME) VALUES(?,?,?,?,?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, me.nazwa);
                        pst.setInt(2, me.b_zycia);
                        pst.setInt(3, me.b_mana);
                        pst.setInt(4, me.b_sila);
                        pst.setInt(5, me.b_zrecznosc);
                        pst.setInt(6, me.b_roztropnosc);
                        pst.setInt(7, me.b_budowa);
                        pst.setInt(8, me.b_charyzma);
                        pst.setInt(9, me.b_inteligencja);
                        pst.setString(10, me.opis);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajMagicznyEkwipunekDoInwentarza(int id_inwentarza, int id_me)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.magiczny_ekwipunek_w_inwentarzu (ID_I,ID_ME) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_inwentarza);
                        pst.setInt(2, id_me);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajMajatek(String nazwa, String rodzaj_majatku, int wartosc)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.majatek (Nazwa_MJ, Rodzaj_majątku_MJ, Wartość_MJ) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);


                        pst.setString(1, nazwa);
                        pst.setString(2, rodzaj_majatku);
                        pst.setInt(3, wartosc );

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajMajatekDoInwentarza(int id_inwentarza, int id_majatku)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.majątek_w_inwentarzu (ID_I,ID_MJ) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_inwentarza);
                        pst.setInt(2, id_majatku);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }



        public void dodajMiksture(String nazwa, int pojemnosc, int czasdziałania)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.mikstura (Nazwa_MIKS, Pojemność_MIKS, Czas_działania_MIKS) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);


                        pst.setString(1, nazwa);
                        pst.setInt(2, pojemnosc);
                        pst.setInt(3, czasdziałania );

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajMikstureDoInwentarza(int id_inwentarza, int id_mikstury)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.mikstury_w_inwentarzu (ID_I,ID_MIKS) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_inwentarza);
                        pst.setInt(2, id_mikstury);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajPostac(Postac p)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.postać (Imie_P,Wzrost_P,Waga_P,Kolor_oczu_P,Kolor_włosów_P,Karnacja_P,Poziom_P,Siła_P,Zręczność_P,Roztropność_P,Inteligencja_P,Budowa_P,Charyzma_P,Historia_P,Życia_P,ID_CHAR,ID_RS,ID_KL,ID_I) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, p.imie_p);
                        pst.setInt(2, p.wzrost);
                        pst.setInt(3, p.waga);
                        pst.setString(4, p.kolor_oczu);
                        pst.setString(5, p.kolor_wlosow);
                        pst.setString(6, p.karnacja);
                        pst.setInt(7, p.poziom);
                        pst.setInt(8, p.sila);
                        pst.setInt(9, p.zrecznosc);
                        pst.setInt(10, p.roztropnosc);
                        pst.setInt(11, p.inteligencja);
                        pst.setInt(12, p.budowa);
                        pst.setInt(13, p.charyzma);
                        pst.setString(14, p.historia);
                        pst.setInt(15, p.zycie);
                        pst.setInt(16, p.id_char);
                        pst.setInt(17, p.id_rs);
                        pst.setInt(18, p.id_kl);
                        pst.setInt(19, p.id_inw);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajRase(String nazwa_rasy)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.rasa (Nazwa_RS) VALUES(?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, nazwa_rasy);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajTypBroni(String nazwa_tb, int id_b)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.typ_broni (Nazwa_TB,ID_B) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, nazwa_tb);
                        pst.setInt(2, id_b);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajTypCzesciCiala(String nazwa_tcc)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.typ_części_ciała (Nazwa_TCC) VALUES(?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, nazwa_tcc);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajTypZbroi(String nazwa_tzb, int id_zb)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.typ_zbroi (Nazwa_TZB,ID_ZB) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, nazwa_tzb);
                        pst.setInt(2, id_zb);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }


        public void dodajUmiejetnosciKlasy(int id_umiejetnosci, int id_klasy)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.umiejętności_klasy (ID_U,ID_KL) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_umiejetnosci);
                        pst.setInt(2, id_klasy);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajUmiejetnosciPostaci(int id_postaci, int id_umiejetnosci)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.umiejętności_postaci (ID_P,ID_U) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_postaci);
                        pst.setInt(2, id_umiejetnosci);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajUmiejetnosciRas(int id_rasy, int id_umiejetnosci)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.umiejętności_ras (ID_RS,ID_U) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_rasy);
                        pst.setInt(2, id_umiejetnosci);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajUmiejetnosci(String nazwa_um, int wym_poz, String opis)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.umiejętność (Nazwa_U,Wymagany_poziom_U,Opis_U) VALUES(?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, nazwa_um);
                        pst.setInt(2, wym_poz);
                        pst.setString(3, opis);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

        public void dodajZbroje(String nazwa_zbroi, int rzadkosc, int klasa, int wytrzymalosc, int id_cc)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.zbroja (Nazwa_ZB,Rzadkość_ZB,Klasa_Pancerza_ZB,Wytrzymałość_ZB,ID_CC) VALUES(?,?,?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, nazwa_zbroi);
                        pst.setInt(2, rzadkosc);
                        pst.setInt(3, klasa);
                        pst.setInt(4, wytrzymalosc);
                        pst.setInt(5, id_cc);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }


        public void dodajZwojDoInwentarza(int id_inwentarza, int id_zwoju)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.zwoje_w_inwentarzu (ID_I,ID_ZWOJ) VALUES(?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setInt(1, id_inwentarza);
                        pst.setInt(2, id_zwoju);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }


        public void dodajZwoje(String nazwa_zwoju, String opis, int czas_dzialania)
        {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        java.sql.PreparedStatement pst = null;
                        conn = DriverManager.getConnection(url, user, password);
                        if (conn != null) System.out.println("Connected");
                        String sql = "INSERT INTO generator_postaci_rpg1.zwój (Nazwa_ZWOJ,Opis_działania_ZWOJ,Czas_dzialania_ZWOJ) VALUES(?,?,?)";
                        pst = conn.prepareStatement(sql);

                        pst.setString(1, nazwa_zwoju);
                        pst.setString(2,opis);
                        pst.setInt(3,czas_dzialania);

                        pst.executeUpdate();

                } catch (ClassNotFoundException e) {
                        System.out.println("Driver problem");
                } catch (SQLException e) {
                        System.out.println(e);
                }
        }

}
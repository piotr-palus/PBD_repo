CREATE SCHEMA `generator_postaci_rpg1`;

CREATE TABLE `generator_postaci_rpg1`.`atut` (
  `ID_AT` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_AT` varchar(60) NOT NULL,
  `Wymagany_poziom_AT` int(11) UNSIGNED NOT NULL,
  `Opis_AT` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_AT`)
);

CREATE TABLE `generator_postaci_rpg1`.`inwentarz` (
  `ID_I` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_I`)
);

CREATE TABLE `generator_postaci_rpg1`.`klasa` (
  `ID_KL` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_KL` varchar(30) NOT NULL,
  `Poziom_KL` int(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`ID_KL`)
);

CREATE TABLE `generator_postaci_rpg1`.`magiczny_ekwipunek` (
  `ID_ME` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_ME` varchar(30) NOT NULL,
  `Bonus_Życia_ME` int(11) DEFAULT NULL,
  `Bonus_Mana_ME` int(11) DEFAULT NULL,
  `Bonus_Siła_ME` int(11) DEFAULT NULL,
  `Bonus_Zręczność_ME` int(11) DEFAULT NULL,
  `Bonus_Roztropność_ME` int(11) DEFAULT NULL,
  `Bonus_Budowa_ME` int(11) DEFAULT NULL,
  `Bonus_Charyzma_ME` int(11) DEFAULT NULL,
  `Bonus_Inteligencja_ME` int(11) DEFAULT NULL,
  `Opis_działania_ME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_ME`)
);

CREATE TABLE `generator_postaci_rpg1`.`majatek` (
  `ID_MJ` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_MJ` varchar(30) NOT NULL,
  `Rodzaj_majątku_MJ` varchar(30) NOT NULL,
  `Wartość_MJ` int(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`ID_MJ`)
);

CREATE TABLE `generator_postaci_rpg1`.`mikstura` (
  `ID_MIKS` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_MIKS` varchar(30) NOT NULL,
  `Pojemność_MIKS` int(11) DEFAULT NULL,
  `Opis_działania_MIKS` varchar(255) DEFAULT NULL,
  `Czas_działania_MIKS` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_MIKS`)
);

CREATE TABLE `generator_postaci_rpg1`.`rasa` (
  `ID_RS` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_RS` varchar(30) NOT NULL,
  PRIMARY KEY (`ID_RS`)
);

CREATE TABLE `generator_postaci_rpg1`.`umiejętność` (
  `ID_U` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_U` varchar(30) NOT NULL,
  `Wymagany_poziom_U` int(11) UNSIGNED NOT NULL,
  `Opis_U` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_U`)
);

CREATE TABLE `generator_postaci_rpg1`.`zwój` (
  `ID_ZWOJ` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_ZWOJ` varchar(45) NOT NULL,
  `Opis_działania_ZWOJ` varchar(255) DEFAULT NULL,
  `Czas_dzialania_ZWOJ` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_ZWOJ`)
);

CREATE TABLE `generator_postaci_rpg1`.`charakter` (
  `ID_CHAR` int(11) NOT NULL AUTO_INCREMENT,
  `Moralność_CHAR` varchar(20) NOT NULL,
  `Personalność_CHAR` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_CHAR`)
);

CREATE TABLE `generator_postaci_rpg1`.`postać` (
  `ID_P` int(11) NOT NULL AUTO_INCREMENT,
  `Imie_P` varchar(30) NOT NULL,
  `Wzrost_P` int(11) UNSIGNED NOT NULL,
  `Waga_P` int(11) UNSIGNED NOT NULL,
  `Kolor_oczu_P` varchar(15) DEFAULT NULL,
  `Kolor_włosów_P` varchar(15) DEFAULT NULL,
  `Karnacja_P` varchar(15) DEFAULT NULL,
  `Poziom_P` int(11) UNSIGNED NOT NULL,
  `Siła_P` int(11) UNSIGNED NOT NULL,
  `Zręczność_P` int(11) UNSIGNED NOT NULL,
  `Roztropność_P` int(11) UNSIGNED NOT NULL,
  `Inteligencja_P` int(11) UNSIGNED NOT NULL,
  `Budowa_P` int(11) UNSIGNED NOT NULL,
  `Charyzma_P` int(11) UNSIGNED NOT NULL,
  `Historia_P` varchar(255) DEFAULT NULL,
  `Życia_P` varchar(45) DEFAULT NULL,
  `ID_CHAR` int(11) DEFAULT NULL,
  `ID_RS` int(11) DEFAULT NULL,
  `ID_KL` int(11) DEFAULT NULL,
  `ID_I` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_P`),
  KEY `ID_CHAR_idx` (`ID_CHAR`),
  KEY `ID_RS_idx` (`ID_RS`),
  KEY `ID_KL_idx` (`ID_KL`),
  KEY `ID_I_idx` (`ID_I`),
  CONSTRAINT `ID_CHAR` FOREIGN KEY (`ID_CHAR`) REFERENCES `charakter` (`ID_CHAR`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_I` FOREIGN KEY (`ID_I`) REFERENCES `inwentarz` (`ID_I`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_KL` FOREIGN KEY (`ID_KL`) REFERENCES `klasa` (`ID_KL`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_RS` FOREIGN KEY (`ID_RS`) REFERENCES `rasa` (`ID_RS`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`czar` (
  `ID_CZ` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_CZ` varchar(30) NOT NULL,
  `Wymagany_poziom_CZ` int(11) UNSIGNED NOT NULL,
  `Wymgany_poziom_klasy_CZ` int(11) UNSIGNED NOT NULL,
  `Koszt_many_CZ` int(11) NOT NULL,
  `Koszt_życia_CZ` int(11) NOT NULL,
  `Ranga_CZ` tinyint(1) UNSIGNED NOT NULL,
  PRIMARY KEY (`ID_CZ`)
);

CREATE TABLE `generator_postaci_rpg1`.`typ_części_ciała` (
  `ID_TCC` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_TCC` varchar(30) NOT NULL,
  PRIMARY KEY (`ID_TCC`)
);

CREATE TABLE `generator_postaci_rpg1`.`część_ciała` (
  `ID_CC` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_CC` varchar(30) NOT NULL,
  `Punkty_Życia_CC` int(11) UNSIGNED NOT NULL,
  `ID_P` int(11) DEFAULT NULL,
  `ID_TCC` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_CC`),
  KEY `ID_P_idx` (`ID_P`),
  KEY `ID_TCC_idx` (`ID_TCC`),
  CONSTRAINT `ID_P` FOREIGN KEY (`ID_P`) REFERENCES `postać` (`ID_P`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_TCC` FOREIGN KEY (`ID_TCC`) REFERENCES `typ_części_ciała` (`ID_TCC`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`broń` (
  `ID_B` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_B` varchar(30) NOT NULL,
  `Rzadkość_B` int(11) UNSIGNED NOT NULL,
  `Atak_B` int(11) UNSIGNED NOT NULL,
  `Szybkość_ataku_B` int(11) UNSIGNED NOT NULL,
  `Wytrzymałość_B` int(11) UNSIGNED NOT NULL,
  `ID_CC` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_B`),
  KEY `ID_CC_bron` (`ID_CC`),
  CONSTRAINT `ID_CC_bron` FOREIGN KEY (`ID_CC`) REFERENCES `część_ciała` (`ID_CC`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`zbroja` (
  `ID_ZB` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_ZB` varchar(30) NOT NULL,
  `Rzadkość_ZB` int(11) UNSIGNED NOT NULL,
  `Klasa_Pancerza_ZB` int(11) UNSIGNED NOT NULL,
  `Wytrzymałość_ZB` int(11) UNSIGNED NOT NULL,
  `ID_CC` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_ZB`),
  KEY `ID_CC_zbroja` (`ID_CC`),
  CONSTRAINT `ID_CC_zbroja` FOREIGN KEY (`ID_CC`) REFERENCES `część_ciała` (`ID_CC`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`typ_zbroi` (
  `ID_TZB` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_TZB` varchar(30) NOT NULL,
  `ID_ZB` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_TZB`),
  KEY `ID_ZB` (`ID_ZB`),
  CONSTRAINT `ID_ZB` FOREIGN KEY (`ID_ZB`) REFERENCES `zbroja` (`ID_ZB`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`typ_broni` (
  `ID_TB` int(11) NOT NULL AUTO_INCREMENT,
  `Nazwa_TB` varchar(30) NOT NULL,
  `ID_B` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_TB`),
  KEY `ID_B` (`ID_B`),
  CONSTRAINT `ID_B` FOREIGN KEY (`ID_B`) REFERENCES `broń` (`ID_B`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`konfiguracja_broni` (
  `ID_TB` int(11) NOT NULL,
  `ID_TCC` int(11) NOT NULL,
  PRIMARY KEY (`ID_TB`,`ID_TCC`),
  KEY `ID_TCC_TB_idx` (`ID_TCC`),
  CONSTRAINT `ID_TB_TCC` FOREIGN KEY (`ID_TB`) REFERENCES `typ_broni` (`ID_TB`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_TCC_TB` FOREIGN KEY (`ID_TCC`) REFERENCES `typ_części_ciała` (`ID_TCC`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`konfiguracja_zbroi` (
  `ID_TZB` int(11) NOT NULL,
  `ID_TCC` int(11) NOT NULL,
  PRIMARY KEY (`ID_TZB`,`ID_TCC`),
  KEY `ID_TCC_TZB_idx` (`ID_TCC`),
  CONSTRAINT `ID_TCC_TZB` FOREIGN KEY (`ID_TCC`) REFERENCES `typ_części_ciała` (`ID_TCC`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_TZB_TCC` FOREIGN KEY (`ID_TZB`) REFERENCES `typ_zbroi` (`ID_TZB`) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE `generator_postaci_rpg1`.`umiejętności_ras` (
  `ID_RS` int(11) NOT NULL,
  `ID_U` int(11) NOT NULL,
  PRIMARY KEY (`ID_RS`,`ID_U`),
  KEY `ID_U_RS_idx` (`ID_U`),
  CONSTRAINT `ID_RS_U` FOREIGN KEY (`ID_RS`) REFERENCES `rasa` (`ID_RS`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_U_RS` FOREIGN KEY (`ID_U`) REFERENCES `umiejętność` (`ID_U`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`umiejętności_postaci` (
  `ID_P` int(11) NOT NULL,
  `ID_U` int(11) NOT NULL,
  PRIMARY KEY (`ID_P`,`ID_U`),
  KEY `ID_U_P_idx` (`ID_U`),
  CONSTRAINT `ID_P_U` FOREIGN KEY (`ID_P`) REFERENCES `postać` (`ID_P`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_U_P` FOREIGN KEY (`ID_U`) REFERENCES `umiejętność` (`ID_U`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`umiejętności_klasy` (
  `ID_U` int(11) NOT NULL,
  `ID_KL` int(11) NOT NULL,
  PRIMARY KEY (`ID_U`,`ID_KL`),
  KEY `ID_KL_U_idx` (`ID_KL`),
  CONSTRAINT `ID_KL_U` FOREIGN KEY (`ID_KL`) REFERENCES `klasa` (`ID_KL`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_U_KL` FOREIGN KEY (`ID_U`) REFERENCES `umiejętność` (`ID_U`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`atuty_klasy` (
  `ID_AT` int(11) NOT NULL,
  `ID_KL` int(11) NOT NULL,
  PRIMARY KEY (`ID_AT`,`ID_KL`),
  KEY `ID_KL_AT_idx` (`ID_KL`),
  CONSTRAINT `ID_AT_KL` FOREIGN KEY (`ID_AT`) REFERENCES `atut` (`ID_AT`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_KL_AT` FOREIGN KEY (`ID_KL`) REFERENCES `klasa` (`ID_KL`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`atuty_postaci` (
  `ID_P` int(11) NOT NULL,
  `ID_AT` int(11) NOT NULL,
  PRIMARY KEY (`ID_P`,`ID_AT`),
  KEY `ID_P_idx` (`ID_P`),
  KEY `ID_AT_idx` (`ID_AT`),
  CONSTRAINT `ID_AT_P` FOREIGN KEY (`ID_AT`) REFERENCES `atut` (`ID_AT`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_P_AT` FOREIGN KEY (`ID_P`) REFERENCES `postać` (`ID_P`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`czary_klasy` (
  `ID_KL` int(11) NOT NULL,
  `ID_CZ` int(11) NOT NULL,
  PRIMARY KEY (`ID_KL`,`ID_CZ`),
  KEY `ID_CZ_KL_idx` (`ID_CZ`),
  CONSTRAINT `ID_CZ_KL` FOREIGN KEY (`ID_CZ`) REFERENCES `czar` (`ID_CZ`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_KL_CZ` FOREIGN KEY (`ID_KL`) REFERENCES `klasa` (`ID_KL`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`zwoje_w_inwentarzu` (
  `ID_I` int(11) NOT NULL,
  `ID_ZWOJ` int(11) NOT NULL,
  PRIMARY KEY (`ID_I`,`ID_ZWOJ`),
  KEY `ID_ZWOJ_I_idx` (`ID_ZWOJ`),
  CONSTRAINT `ID_I_ZWOJ` FOREIGN KEY (`ID_I`) REFERENCES `inwentarz` (`ID_I`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_ZWOJ_I` FOREIGN KEY (`ID_ZWOJ`) REFERENCES `zwój` (`ID_ZWOJ`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`mikstury_w_inwentarzu` (
  `ID_I` int(11) NOT NULL,
  `ID_MIKS` int(11) NOT NULL,
  PRIMARY KEY (`ID_I`,`ID_MIKS`),
  KEY `ID_MIKS_I_idx` (`ID_MIKS`),
  CONSTRAINT `ID_I_MIKS` FOREIGN KEY (`ID_I`) REFERENCES `inwentarz` (`ID_I`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_MIKS_I` FOREIGN KEY (`ID_MIKS`) REFERENCES `mikstura` (`ID_MIKS`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`majątek_w_inwentarzu` (
  `ID_I` int(11) NOT NULL,
  `ID_MJ` int(11) NOT NULL,
  PRIMARY KEY (`ID_I`,`ID_MJ`),
  KEY `ID_MJ_I_idx` (`ID_MJ`),
  CONSTRAINT `ID_I_MJ` FOREIGN KEY (`ID_I`) REFERENCES `inwentarz` (`ID_I`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_MJ_I` FOREIGN KEY (`ID_MJ`) REFERENCES `majatek` (`ID_MJ`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `generator_postaci_rpg1`.`magiczny_ekwipunek_w_inwentarzu` (
  `ID_I` int(11) NOT NULL,
  `ID_ME` int(11) NOT NULL,
  PRIMARY KEY (`ID_I`,`ID_ME`),
  KEY `ID_ME_I_idx` (`ID_ME`),
  CONSTRAINT `ID_I_ME` FOREIGN KEY (`ID_I`) REFERENCES `inwentarz` (`ID_I`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_ME_I` FOREIGN KEY (`ID_ME`) REFERENCES `magiczny_ekwipunek` (`ID_ME`) ON DELETE CASCADE ON UPDATE CASCADE
);

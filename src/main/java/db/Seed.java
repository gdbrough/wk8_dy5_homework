package db;

import models.CountryType;
import models.Race;

import javax.crypto.spec.DHGenParameterSpec;

public class Seed {

    public static void seedDB() {

        Race race1 = new Race("Grand Prix of Qatar", "Losail", CountryType.QATAR, "2018-03-18");
        Race race2 = new Race("Gran Premio Motul de la República Argentina", "Termas de Rio Hondo", CountryType.ARGENTINA, "2018-04-08");
        Race race3 = new Race("Grand Prix of the Americas", "Circuit of the Americas", CountryType.USA, "2018-04-22");
        Race race4 = new Race("Gran Premio Red Bull de España", "Circuito de Jerez", CountryType.SPAIN, "2018-05-06");
        Race race5 = new Race("Grand Prix de France", "Le Mans", CountryType.FRANCE, "2018-05-20");
        Race race6 = new Race("Gran Premio d'Italia Oakley", "Autodromo del Mugello", CountryType.ITALY, "2018-06-03");
        Race race7 = new Race("Gran Premi Monster Energy de Catalunya", "Circuit de Barcelona-Catalunya", CountryType.SPAIN, "2018-06-17");
        Race race8 = new Race("Motul TT Assen", "TT Circuit Assen", CountryType.NETHERLANDS, "2018-07-01");
        Race race9 = new Race("GoPro Motorrad Grand Prix Deutschland", "Sachsenring", CountryType.GERMANY, "2018-07-15");
        Race race10 = new Race("Monster Energy Grand Prix České republiky", "Automotodrom Brno", CountryType.CZECH_REPUBLIC, "2018-08-05");
        Race race11 = new Race("Motorrad Grand Prix von Österreich", "Red Bull Ring", CountryType.AUSTRIA, "2018-08-12");
        Race race12 = new Race("British Grand Prix", "Silverstone", CountryType.UNITED_KINGDOM, "2018-08-26");
        Race race13 = new Race("Gran Premio di San Marino", "Misano", CountryType.ITALY, "2018-09-09");
        Race race14 = new Race("Gran Premio Movistar de Aragón", "Motorland, Aragon", CountryType.SPAIN, "2018-09-23");
        Race race15 = new Race("PTT Thailand Grand Prix", "Buriram International Circuit", CountryType.THAILAND, "2018-10-07");
        Race race16 = new Race("Motul Grand Prix of Japan", "Twin Ring Motegi", CountryType.JAPAN, "2018-10-21");
        Race race17 = new Race("Australian Motorcycle Grand Prix", "Phillip Island", CountryType.AUSTRALIA, "2018-10-28");
        Race race18 = new Race("Buriram International Circuit", "Sepang International Circuit", CountryType.MALAYSIA, "2018-11-04");
        Race race19 = new Race("Gran Premio Motul de la Comunitat Valenciana", "Circuit Ricardo Tormo", CountryType.SPAIN, "2018-11-18");

    }
}

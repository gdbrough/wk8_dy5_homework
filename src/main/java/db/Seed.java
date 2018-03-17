package db;

import models.*;

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

        Manufacturer manufacturer1 = new Manufacturer(ManufacturerType.YAMAHA, CountryType.JAPAN);
        DBHelper.save(manufacturer1);
        Manufacturer manufacturer2 = new Manufacturer(ManufacturerType.HONDA, CountryType.JAPAN);
        DBHelper.save(manufacturer2);
        Manufacturer manufacturer3 = new Manufacturer(ManufacturerType.SUZUKI, CountryType.JAPAN);
        DBHelper.save(manufacturer3);
        Manufacturer manufacturer4 = new Manufacturer(ManufacturerType.DUCATI, CountryType.ITALY);
        DBHelper.save(manufacturer4);
        Manufacturer manufacturer5 = new Manufacturer(ManufacturerType.APRILIA, CountryType.ITALY);
        DBHelper.save(manufacturer5);
        Manufacturer manufacturer6 = new Manufacturer(ManufacturerType.KTM, CountryType.AUSTRIA);
        DBHelper.save(manufacturer6);



        Team team1 = new Team("Movistar Yamaha", manufacturer1);
        DBHelper.save(team1);
        Team team2 = new Team("Tech 3", manufacturer1);
        DBHelper.save(team2);
        Team team3 = new Team("Ducati Corse", manufacturer4);
        DBHelper.save(team3);
        Team team4 = new Team("Alma Pramac Racing", manufacturer4);
        DBHelper.save(team4);
        Team team5 = new Team("Angel Nieto Team", manufacturer4);
        DBHelper.save(team5);
        Team team6 = new Team("Aprilia Racing Team Gresini", manufacturer5);
        DBHelper.save(team6);
        Team team7 = new Team("EG 0,0 Marc VDS", manufacturer2);
        DBHelper.save(team7);
        Team team8 = new Team("LCR Honda", manufacturer2);
        DBHelper.save(team8);
        Team team9 = new Team("Reale Avintia Racing", manufacturer4);
        DBHelper.save(team9);
        Team team10 = new Team("Red Bull KTM Factory Racing", manufacturer6);
        DBHelper.save(team10);
        Team team11 = new Team("Repsol Honda Team", manufacturer2);
        DBHelper.save(team11);
        Team team12 = new Team("Team SUZUKI ECSTAR", manufacturer3);
        DBHelper.save(team12);


        Manager manager1 = new Manager("Lin", "Jarvis", team1);
        DBHelper.save(manager1);


        Rider rider1 = new Rider("Valentino", "Rossi", CountryType.ITALY, 46, 0, manager1);
        DBHelper.save(rider1);

    }
}

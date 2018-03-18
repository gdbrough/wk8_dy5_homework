package db;

import models.*;

public class Seed {

    public static void seedDB() {

        Race race1 = new Race("Grand Prix of Qatar", "Losail", CountryType.QATAR, "2018-03-18");
        DBHelper.save(race1);
        Race race2 = new Race("Gran Premio Motul de la República Argentina", "Termas de Rio Hondo", CountryType.ARGENTINA, "2018-04-08");
        DBHelper.save(race2);
        Race race3 = new Race("Grand Prix of the Americas", "Circuit of the Americas", CountryType.USA, "2018-04-22");
        DBHelper.save(race3);
        Race race4 = new Race("Gran Premio Red Bull de España", "Circuito de Jerez", CountryType.SPAIN, "2018-05-06");
        DBHelper.save(race4);
        Race race5 = new Race("Grand Prix de France", "Le Mans", CountryType.FRANCE, "2018-05-20");
        DBHelper.save(race5);
        Race race6 = new Race("Gran Premio d'Italia Oakley", "Autodromo del Mugello", CountryType.ITALY, "2018-06-03");
        DBHelper.save(race6);
        Race race7 = new Race("Gran Premi Monster Energy de Catalunya", "Circuit de Barcelona-Catalunya", CountryType.SPAIN, "2018-06-17");
        DBHelper.save(race7);
        Race race8 = new Race("Motul TT Assen", "TT Circuit Assen", CountryType.NETHERLANDS, "2018-07-01");
        DBHelper.save(race8);
        Race race9 = new Race("GoPro Motorrad Grand Prix Deutschland", "Sachsenring", CountryType.GERMANY, "2018-07-15");
        DBHelper.save(race9);
        Race race10 = new Race("Monster Energy Grand Prix České republiky", "Automotodrom Brno", CountryType.CZECH_REPUBLIC, "2018-08-05");
        DBHelper.save(race10);
        Race race11 = new Race("Motorrad Grand Prix von Österreich", "Red Bull Ring", CountryType.AUSTRIA, "2018-08-12");
        DBHelper.save(race11);
        Race race12 = new Race("British Grand Prix", "Silverstone", CountryType.UNITED_KINGDOM, "2018-08-26");
        DBHelper.save(race12);
        Race race13 = new Race("Gran Premio di San Marino", "Misano", CountryType.ITALY, "2018-09-09");
        DBHelper.save(race13);
        Race race14 = new Race("Gran Premio Movistar de Aragón", "Motorland, Aragon", CountryType.SPAIN, "2018-09-23");
        DBHelper.save(race14);
        Race race15 = new Race("PTT Thailand Grand Prix", "Buriram International Circuit", CountryType.THAILAND, "2018-10-07");
        DBHelper.save(race15);
        Race race16 = new Race("Motul Grand Prix of Japan", "Twin Ring Motegi", CountryType.JAPAN, "2018-10-21");
        DBHelper.save(race16);
        Race race17 = new Race("Australian Motorcycle Grand Prix", "Phillip Island", CountryType.AUSTRALIA, "2018-10-28");
        DBHelper.save(race17);
        Race race18 = new Race("Buriram International Circuit", "Sepang International Circuit", CountryType.MALAYSIA, "2018-11-04");
        DBHelper.save(race18);
        Race race19 = new Race("Gran Premio Motul de la Comunitat Valenciana", "Circuit Ricardo Tormo", CountryType.SPAIN, "2018-11-18");
        DBHelper.save(race19);

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
        team1.assignManager(manager1);
        DBHelper.update(team1);
        Manager manager2 = new Manager("Hervé", "Poncharal", team2);
        DBHelper.save(manager2);
        team2.assignManager(manager2);
        DBHelper.update(team2);
        Manager manager3 = new Manager("Luigi", "dall'Igna", team3);
        DBHelper.save(manager3);
        team3.assignManager(manager3);
        DBHelper.update(team3);
        Manager manager4 = new Manager("Paolo", "Campinoti", team4);
        DBHelper.save(manager4);
        team4.assignManager(manager4);
        DBHelper.update(team4);
        Manager manager5 = new Manager("Gelete", "Nieto", team5);
        DBHelper.save(manager5);
        team5.assignManager(manager5);
        DBHelper.update(team5);
        Manager manager6 = new Manager("Fausto", "Gresini", team6);
        DBHelper.save(manager6);
        team6.assignManager(manager6);
        DBHelper.update(team6);
        Manager manager7 = new Manager("Marc", "van der Straten", team7);
        DBHelper.save(manager7);
        team7.assignManager(manager7);
        DBHelper.update(team7);
        Manager manager8 = new Manager("Lucio", "Cecchinello", team8);
        DBHelper.save(manager8);
        team8.assignManager(manager8);
        DBHelper.update(team8);
        Manager manager9 = new Manager("Raúl", "Romero", team9);
        DBHelper.save(manager9);
        team9.assignManager(manager9);
        DBHelper.update(team9);
        Manager manager10 = new Manager("Mike", "Leitner", team10);
        DBHelper.save(manager10);
        team10.assignManager(manager10);
        DBHelper.update(team10);
        Manager manager11 = new Manager("Alberto", "Puig", team11);
        DBHelper.save(manager11);
        team11.assignManager(manager11);
        DBHelper.update(team11);
        Manager manager12 = new Manager("Davide", "Brivio", team12);
        DBHelper.save(manager12);
        team12.assignManager(manager12);
        DBHelper.update(team12);



        Rider rider1 = new Rider("Valentino", "Rossi", CountryType.ITALY, 46, 0, manager1);
        DBHelper.save(rider1);
        Rider rider2 = new Rider("Maverick", "Vinales", CountryType.SPAIN, 25, 0, manager1);
        DBHelper.save(rider2);
        Rider rider3 = new Rider("Johann", "Zarco", CountryType.FRANCE, 5, 0, manager2);
        DBHelper.save(rider3);
        Rider rider4 = new Rider("Hafizh", "Syahrin", CountryType.MALAYSIA, 55, 0, manager2);
        DBHelper.save(rider4);
        Rider rider5 = new Rider("Andrea", "Dovizioso", CountryType.ITALY, 4, 0, manager3);
        DBHelper.save(rider5);
        Rider rider6 = new Rider("Jorge", "Lorenzo", CountryType.SPAIN, 99, 0, manager3);
        DBHelper.save(rider6);
        Rider rider7 = new Rider("Danilo", "Petrucci", CountryType.ITALY, 9, 0, manager4);
        DBHelper.save(rider7);
        Rider rider8 = new Rider("Jack", "Miller", CountryType.AUSTRALIA, 43, 0, manager4);
        DBHelper.save(rider8);
        Rider rider9 = new Rider("Karel", "Abraham", CountryType.CZECH_REPUBLIC, 17, 0, manager5);
        DBHelper.save(rider9);
        Rider rider10 = new Rider("Alvaro", "Bautista", CountryType.SPAIN, 19, 0, manager5);
        DBHelper.save(rider10);
        Rider rider11 = new Rider("Aleix", "Espargaro", CountryType.SPAIN, 43, 0, manager6);
        DBHelper.save(rider11);
        Rider rider12 = new Rider("Scott", "Redding", CountryType.UNITED_KINGDOM, 45, 0, manager6);
        DBHelper.save(rider12);
        Rider rider13 = new Rider("Franco", "Morbidelli", CountryType.FRANCE, 21, 0, manager7);
        DBHelper.save(rider13);
        Rider rider14 = new Rider("Thomas", "Luthi", CountryType.SWITZERLAND, 12, 0, manager7);
        DBHelper.save(rider14);
        Rider rider15 = new Rider("Takaki", "Nakagami", CountryType.JAPAN, 30, 0, manager8);
        DBHelper.save(rider15);
        Rider rider16 = new Rider("Cal", "Crutchlow", CountryType.UNITED_KINGDOM, 35, 0, manager8);
        DBHelper.save(rider16);
        Rider rider17 = new Rider("Xavier", "Simeon", CountryType.BELGIUM, 10, 0, manager9);
        DBHelper.save(rider17);
        Rider rider18 = new Rider("Tito", "Rabat", CountryType.SPAIN, 53, 0, manager9);
        DBHelper.save(rider18);
        Rider rider19 = new Rider("Bradley", "Smith", CountryType.UNITED_KINGDOM, 38, 0, manager10);
        DBHelper.save(rider19);
        Rider rider20 = new Rider("Pol", "Espargaro", CountryType.SPAIN, 44, 0, manager10);
        DBHelper.save(rider20);
        Rider rider21 = new Rider("Dani", "Pedrosa", CountryType.SPAIN, 26, 0, manager11);
        DBHelper.save(rider21);
        Rider rider22 = new Rider("Marc", "Marquez", CountryType.SPAIN, 93, 0, manager11);
        DBHelper.save(rider22);
        Rider rider23 = new Rider("Andrea", "Iannone", CountryType.ITALY, 29, 0, manager12);
        DBHelper.save(rider23);
        Rider rider24 = new Rider("Alex", "Rins", CountryType.SPAIN, 42, 0, manager12);
        DBHelper.save(rider24);


    }
}

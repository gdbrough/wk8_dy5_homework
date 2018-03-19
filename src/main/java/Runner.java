import db.DBHelper;
import db.Seed;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    private Seed seed;
    private Race race;
    private Rider rider;
    private Manager manager;
    private Team team;
    private Manufacturer manufacturer;

    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.season();

        List<Rider> riderChampionshipStanding = DBHelper.getRiderChampionship();

        List<Team> teams = DBHelper.getAll(Team.class);
        for (Team team : teams){
            team.assignTeamChampionshipPoints();
            DBHelper.saveOrUpdate(team);
        }
        List<Team> teamChampionshipStanding = DBHelper.getTeamChampionship();


        List<Manufacturer> allManufacturers = DBHelper.getAll(Manufacturer.class);
        for (Manufacturer manufacturer : allManufacturers){
            manufacturer.assignManufacturerChampionshipPoints();
            DBHelper.saveOrUpdate(manufacturer);
        }
//        List<Manufacturer> manufacturerChampionshipStanding = DBHelper.getManufacturerChampionship();



//        List<Team> teamsByManufacture = DBHelper.findTeamsByManufacturer(allManufacturers.get(0));
//
//        List<Manager> allManagers = DBHelper.getAll(Manager.class);
//
//        List<Rider> findRidersByManager = DBHelper.findRidersByManager(allManagers.get(0));
//
//        List<Rider> ridersByManager = new ArrayList<Rider>();
//
//        for (Manager manager : allManagers) {
//            List<Rider> temp = DBHelper.findRidersByManager(manager);
//            for (Rider rider : temp){
//                ridersByManager.add(rider);
//            }
//        }



    }

    public void season(){

        seed.seedDB();

        List<Race> races = DBHelper.getAll(Race.class);
        for (Race race : races){
            race.runRace();
        }
    }
}

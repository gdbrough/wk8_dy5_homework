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
    private Manufacturer mnfctrr;

    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.season();

        List<Rider> riderChampionshipStanding = DBHelper.getRiderChampionship();

        List<Team> teams = DBHelper.getAll(Team.class);
        for (Team team : teams){
            team.assignTeamChampionshipPoints();
            DBHelper.update(team);
        }
        List<Team> teamChampionshipStanding = DBHelper.getTeamChampionship();


        List<Manufacturer> allManufacturers = DBHelper.getAll(Manufacturer.class);
        for (Manufacturer mnfctrr : allManufacturers){
            mnfctrr.assignManufacturerChampionshipPoints();
            DBHelper.update(mnfctrr);
        }
        List<Manufacturer> manufacturerChampionshipStanding = DBHelper.getManufacturerChampionship();


    }

    public void season(){

        seed.seedDB();

        List<Race> races = DBHelper.getAll(Race.class);
        for (Race race : races){
            race.runRace();
        }
    }
}

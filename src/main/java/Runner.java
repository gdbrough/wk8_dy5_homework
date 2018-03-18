import db.DBHelper;
import db.Seed;
import models.Manufacturer;
import models.Race;
import models.Rider;
import models.Team;

import java.util.List;

public class Runner {

    private Seed seed;
    private Race race;
    private Rider rider;

    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.season();

        List<Rider> riderChampionshipStanding = DBHelper.getRiderChampionship();

//        List<Team> teamChampionshipStanding = DBHelper.getTeamChampionship();

//        List<Manufacturer> manufacturerChampionshipStanding = DBHelper.getManufacturerChampionship();

    }

    public void season(){

        seed.seedDB();

        List<Race> races = DBHelper.getAll(Race.class);
        for (Race race : races){
            race.runRace();
        }
    }
}

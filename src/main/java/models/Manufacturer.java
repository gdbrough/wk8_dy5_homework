package models;

import db.DBHelper;

import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {

    private int id;
    private ManufacturerType manufacturer;
    private CountryType country;
    private Set<Team> teams;
    private int championshipPoints;

    public Manufacturer() {
    }

    public Manufacturer(ManufacturerType manufacturer, CountryType country) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.championshipPoints = championshipPoints;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public ManufacturerType getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Column(name = "country")
    public CountryType getCountry() {
        return country;
    }

    public void setCountry(CountryType country) {
        this.country = country;
    }

    @OneToMany(mappedBy = "manufacturer")
    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> team) {
        this.teams = team;
    }

    @Column(name = "points")
    public int getChampionshipPoints() {
        return championshipPoints;
    }

    public void setChampionshipPoints(int championshipPoints) {
        this.championshipPoints = championshipPoints;
    }

    public void assignManufacturerChampionshipPoints() {

//        ManufacturerType name = ManufacturerType.values()[0];
        List<Team> teams = DBHelper.findTeamsByManufacturer("2");
        for (Team team : teams){
            List<Rider> riders = DBHelper.findRidersByManager(team.getManager());
            for (Rider rider : riders){
                this.championshipPoints += rider.getChampionshipPoints();
            }
        }
    }




//    public void assignTeamChampionshipPoints(){
//        List<Rider> riders = DBHelper.findRidersByManager(this.manager);
//        for (Rider rider : riders){
//            this.championShipPoints += rider.getChampionshipPoints();
//        }
//    }


//    public void assignChampionshipPoints(){
//        List<Manager> managers = DBHelper.findManagersByTeam()
//        List<Rider> riders = DBHelper.findRidersByManager(this.manager);
//        for (Rider rider : riders){
//            this.championshipPoints += rider.getChampionshipPoints();
//        }
//    }
}

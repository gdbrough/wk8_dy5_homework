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
    private ManufacturerType manufacturerName;
    private CountryType country;
    private Set<Team> teams;
    private int championshipPoints;
    private Manufacturer manufacturer;

    public Manufacturer() {
    }

    public Manufacturer(ManufacturerType manufacturerName, CountryType country) {
        this.manufacturerName = manufacturerName;
        this.country = country;
        this.championshipPoints = 0;
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

    @Column(name = "manufacturer")
    public ManufacturerType getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(ManufacturerType manufacturerName) {
        this.manufacturerName = manufacturerName;
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
        List<Team> teams = DBHelper.findTeamsByManufacturer(manufacturer);
//        for (Team team : teams){
//            List<Rider> riders = DBHelper.findRidersByManager(team.getManager());
//            for (Rider rider : riders){
//                this.championshipPoints += rider.getChampionshipPoints();
//            }
//        }
    }

}

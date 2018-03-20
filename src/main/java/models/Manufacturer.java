package models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {

    private int id;
    private ManufacturerType manufacturerName;
    private CountryType country;
    private Set<Team> teams;
    private int championshipPoints;

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

    @OneToMany(mappedBy = "manufacturer", fetch = FetchType.EAGER)
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

        Set<Team> teams =  getTeams();
        for (Team team : teams){
            this.championshipPoints += team.getChampionShipPoints();
        }
    }

}

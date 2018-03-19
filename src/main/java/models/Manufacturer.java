package models;

import db.DBHelper;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {

    private int id;
    private ManufacturerType manufacturer;
    private CountryType country;
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

    @Column(name = "points")
    public int getChampionshipPoints() {
        return championshipPoints;
    }

    public void setChampionshipPoints(int championshipPoints) {
        this.championshipPoints = championshipPoints;
    }

//    public void assignChampionshipPoints(){
//        List<Manager> managers = DBHelper.findManagersByTeam(this.team)
//        List<Rider> riders = DBHelper.findRidersByManager(this.manager);
//        for (Rider rider : riders){
//            this.championshipPoints += rider.getChampionshipPoints();
//        }
//    }
}

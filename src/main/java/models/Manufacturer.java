package models;

import javax.persistence.*;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {

    private int id;
    private ManufacturerType manufacturer;
    private CountryType country;

    public Manufacturer() {
    }

    public Manufacturer(ManufacturerType manufacturer, CountryType country) {
        this.manufacturer = manufacturer;
        this.country = country;
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

//    @OneToMany(mappedBy = "manufacturer")
//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//    }
}

package models;

import db.DBHelper;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

    private int id;
    private String name;
    private Manager manager;
    private Manufacturer manufacturer;
    private int championShipPoints;

    public Team() {
    }

    public Team(String name, Manufacturer manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.championShipPoints = 0;
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(fetch = FetchType.EAGER)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void assignManager(Manager manager) {
        setManager(manager);
    }

    @Column(name="points")
    public int getChampionShipPoints() {
        return championShipPoints;
    }

    public void setChampionShipPoints(int championShipPoints) {
        this.championShipPoints = championShipPoints;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manufacturer_id", nullable = false)
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void assignTeamChampionshipPoints(){
        List<Rider> riders = DBHelper.findRidersByManager(this.manager);
        for (Rider rider : riders){
            this.championShipPoints += rider.getChampionshipPoints();
        }
    }
}

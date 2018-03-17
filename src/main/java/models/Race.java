package models;

import db.DBHelper;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "races")
public class Race {

    private Rider rider;
    private Team team;
    private Manager manager;
    private Manufacturer manufacturer;

    private int id;
    private String name;
    private String track;
    private CountryType country;
    private String date;

    public Race() {
    }

    public Race(String name, String track, CountryType country, String date) {
        this.name = name;
        this.track = track;
        this.country = country;
        this.date = date;
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

    @Column(name = "track")
    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    @Column(name = "country")
    public CountryType getCountry() {
        return country;
    }

    public void setCountry(CountryType country) {
        this.country = country;
    }

    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPointsForPosition(PositionType position){
        return position.getPointsForPosition();
    }

    public void runRace(){
        List<Rider> riders = DBHelper.getAll(Rider.class);
        Collections.shuffle(riders);
        int index = 0;
        for (Rider rider : riders){
            int currentPoints = rider.getChampionshipPoints();
            int pointsForRace = PositionType.values()[index].getPointsForPosition();
            rider.setChampionshipPoints(currentPoints + pointsForRace);
            DBHelper.update(rider);
            if (pointsForRace > 1) {
                index++;
            } else {
                break;
            }
        }
    }


}

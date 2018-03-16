package models;

import javax.persistence.*;

@Entity
@Table(name = "riders")
public class Rider extends TeamMember{

    private CountryType nationality;
    private int raceNumber;
    private int championshipPoints;
    private Manager manager;

    public Rider() {
    }

    public Rider(String firstName, String lastName, CountryType nationality, int raceNumber, int championshipPoints, Manager manager) {
        super(firstName, lastName);
        this.nationality = nationality;
        this.raceNumber = raceNumber;
        this.championshipPoints = championshipPoints;
        this.manager = manager;
    }

    @Column(name = "nationality")
    public CountryType getNationality() {
        return nationality;
    }

    public void setNationality(CountryType nationality) {
        this.nationality = nationality;
    }

    @Column(name = "race_number")
    public int getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(int raceNumber) {
        this.raceNumber = raceNumber;
    }

    @Column(name = "championship_points")
    public int getChampionshipPoints() {
        return championshipPoints;
    }

    public void setChampionshipPoints(int championshipPoints) {
        this.championshipPoints = championshipPoints;
    }

    @OneToOne(fetch = FetchType.EAGER)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}

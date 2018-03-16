package models;

public class Rider {

    private String nationality;
    private int raceNumber;
    private int championshipPoints;
    private Manager manager;

    public Rider() {
    }

    public Rider(String nationality, int raceNumber, int championshipPoints, Manager manager) {
        this.nationality = nationality;
        this.raceNumber = raceNumber;
        this.championshipPoints = championshipPoints;
        this.manager = manager;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(int raceNumber) {
        this.raceNumber = raceNumber;
    }

    public int getChampionshipPoints() {
        return championshipPoints;
    }

    public void setChampionshipPoints(int championshipPoints) {
        this.championshipPoints = championshipPoints;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}

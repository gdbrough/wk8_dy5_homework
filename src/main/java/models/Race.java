package models;

import db.DBHelper;

import java.util.Collections;
import java.util.List;

public class Race {

    private Rider rider;
    private Team team;
    private Manager manager;
    private Manufacturer manufacturer;

    private String name;
    private String track;
    private CountryType country;
    private String date;

    public Race(String name, String track, CountryType country, String date) {
        this.name = name;
        this.track = track;
        this.country = country;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public CountryType getCountry() {
        return country;
    }

    public void setCountry(CountryType country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public List<Rider> getCompetingRiders(){
////    public String getRiders() {
////        String riderList = "";
//        List<Rider> riders = DBHelper.getAll(Rider.class);
////        Collections.shuffle(riders);
////        for (Rider rider : riders){
////            riderList += (rider.displayName() + " ");
////        }
//        return riders;
//    }

    public int getPointsForPosition(PositionType position){
        return position.getPointsForPosition();
    }

    public void runRace(){
        List<Rider> riders = DBHelper.getAll(Rider.class);
//        List<Rider> riders = getCompetingRiders();
        Collections.shuffle(riders);
        int index = 0;
        for (Rider rider : riders){
//        for (int index = 0; index < riders.size(); index++){
            int currentPoints = rider.getChampionshipPoints();
            int pointsForRace = PositionType.values()[index].getPointsForPosition();
            rider.setChampionshipPoints(currentPoints + pointsForRace);
            DBHelper.update(rider);
            if (index < 14) {
                index++;
            } else {
                break;
            }
        }
    }


}

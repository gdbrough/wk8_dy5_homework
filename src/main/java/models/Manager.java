package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "managers")
public class Manager extends TeamMember {

    private Team team;

    public Manager() {
    }

    public Manager(String firstName, String lastName, Team team) {
        super(firstName, lastName);
        this.team = team;
    }

    @OneToOne(fetch = FetchType.EAGER)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}

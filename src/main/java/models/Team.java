package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teams")
public class Team {

    private int id;
    private String name;
//    private Set<TeamMember> teamMembers;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
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


//    @OneToMany(mappedBy = "team")
//    public Set<TeamMember> getTeamMembers() {
//        return teamMembers;
//    }
//
//    public void setTeamMembers(Set<TeamMember> teamMembers) {
//        this.teamMembers = teamMembers;
//    }
}

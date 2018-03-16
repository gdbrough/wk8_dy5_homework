package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "managers")
public class Manager extends TeamMember {


    public Manager() {
    }

//    public Manager(int id, String name, Team team) {
//        super(id, name, team);
//    }


}

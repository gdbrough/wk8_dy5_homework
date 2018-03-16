import db.DBHelper;
import models.Manager;
import models.Team;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {

    private Team team;
    private Manager manager;

    @Before
    public void setUp()  {
        team = new Team("Yamaha");
        DBHelper.saveOrUpdate(team);
        manager = new Manager("Lin", "Jarvis", team);
        DBHelper.saveOrUpdate(manager);
    }

    @Test
    public void testCanAssignManagerToTeam() {
        team.assignManager(manager);
        DBHelper.saveOrUpdate(team);
        Team editedTeam = DBHelper.find(Team.class, team.getId());
        assertEquals(1, editedTeam.getManager().getId());
    }
}

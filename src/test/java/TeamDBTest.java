import db.DBHelper;
import models.Team;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamDBTest {

    private Team team;

    @Before
    public void setUp() {
        team = new Team("Yamaha");
        DBHelper.saveOrUpdate(team);
    }

    @After
    public void tearDown() {
        DBHelper.delete(team);
    }

    @Test
    public void testCanSaveTeam() {
        assertEquals(1, DBHelper.getAll(Team.class).size());
    }
}

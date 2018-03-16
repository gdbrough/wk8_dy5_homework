import db.DBHelper;
import models.Manager;
import models.Team;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerDBTest {

    private Manager manager;
    private Team team;

    @Before
    public void setUp() {
        team = new Team("Yamaha");
        DBHelper.saveOrUpdate(team);
        manager = new Manager("Lin", "Jarvis", team);
        DBHelper.saveOrUpdate(manager);
    }

    @After
    public void tearDown() {
        DBHelper.delete(manager);
        DBHelper.delete(team);
    }

    @Test
    public void testCanSaveManager() {
        assertEquals(1, DBHelper.getAll(Manager.class).size());
    }
}

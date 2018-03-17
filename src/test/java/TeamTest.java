import db.DBHelper;
import models.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {

    private Team team;
    private Manager manager;
    private Manufacturer manufacturer;

    @Before
    public void setUp() {
        manufacturer = new Manufacturer(ManufacturerType.YAMAHA, CountryType.JAPAN);
        DBHelper.saveOrUpdate(manufacturer);
        team = new Team("Movistar Yamaha", manufacturer);
        DBHelper.saveOrUpdate(team);
        manager = new Manager("Lin", "Jarvis", team);
        DBHelper.saveOrUpdate(manager);
    }

    @After
    public void tearDown() {
        DBHelper.delete(manager);
        DBHelper.delete(team);
        DBHelper.delete(manufacturer);
    }

    @Test
    public void testCanAssignManagerToTeam() {
        team.assignManager(manager);
        DBHelper.update(team);
        Team editedTeam = DBHelper.find(Team.class, team.getId());
        assertEquals(manager.getId(), editedTeam.getManager().getId());
    }
}

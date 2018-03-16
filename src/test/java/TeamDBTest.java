import db.DBHelper;
import models.CountryType;
import models.Manufacturer;
import models.ManufacturerType;
import models.Team;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamDBTest {

    private Team team;
    private Manufacturer manufacturer;

    @Before
    public void setUp() {
        manufacturer = new Manufacturer(ManufacturerType.YAMAHA, CountryType.JAPAN);
        DBHelper.saveOrUpdate(manufacturer);
        team = new Team("Movistar Yamaha", manufacturer);
        DBHelper.saveOrUpdate(team);
    }

    @After
    public void tearDown() {
        DBHelper.delete(team);
        DBHelper.delete(manufacturer);
    }

    @Test
    public void testCanSaveTeam() {
        assertEquals(1, DBHelper.getAll(Team.class).size());
    }

    @Test
    public void testCanUpdateTeam() {
        team.setName("amahay");
        DBHelper.saveOrUpdate(team);
        Team editedTeam = DBHelper.find(Team.class, team.getId());
        assertEquals("amahay", editedTeam.getName());
    }
}

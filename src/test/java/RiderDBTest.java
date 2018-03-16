import db.DBHelper;
import models.CountryType;
import models.Manager;
import models.Rider;
import models.Team;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiderDBTest {

    private Rider rider;
    private Team team;
    private Manager manager;
    private CountryType nationality;

    @Before
    public void setUp() {
        team = new Team("Yamaha");
        DBHelper.saveOrUpdate(team);
        manager = new Manager("Lin", "Jarvis", team);
        DBHelper.saveOrUpdate(manager);
        rider = new Rider("Valentino", "Rossi", CountryType.ITALY, 46, 0, manager);
        DBHelper.saveOrUpdate(rider);
    }

    @After
    public void tearDown() {
        DBHelper.delete(rider);
        DBHelper.delete(manager);
        DBHelper.delete(team);
    }

    @Test
    public void testCanSaveRider() {
        assertEquals(1, DBHelper.getAll(Rider.class).size());
    }

    @Test
    public void testCanGetRidersCountry(){
        assertEquals("ITALY", rider.getNationality().toString().toUpperCase());
    }
}

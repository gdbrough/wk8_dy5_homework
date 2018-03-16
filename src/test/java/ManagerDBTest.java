import db.DBHelper;
import models.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerDBTest {

    private Manager manager;
    private Team team;
    private Manufacturer manufacturer;

    @Before
    public void setUp() {
        manufacturer = new Manufacturer(ManufacturerType.YAMAHA, CountryType.JAPAN);
        DBHelper.saveOrUpdate(manufacturer);
        team = new Team("Yamaha", manufacturer);
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
    public void testCanSaveManager() {
        assertEquals(1, DBHelper.getAll(Manager.class).size());
    }
}

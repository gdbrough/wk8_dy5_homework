import db.DBHelper;
import models.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiderDBTest {

    private Rider rider;
    private Team team;
    private Manager manager;
    private Manufacturer manufacturer;

    @Before
    public void setUp() {
        manufacturer = new Manufacturer(ManufacturerType.YAMAHA, CountryType.JAPAN);
        DBHelper.saveOrUpdate(manufacturer);
        team = new Team("Yamaha", manufacturer);
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
        DBHelper.delete(manufacturer);
    }

    @Test
    public void testCanSaveRider() {
        assertEquals(1, DBHelper.getAll(Rider.class).size());
    }

    @Test
    public void testCanGetRidersCountry(){
        assertEquals("ITALY", rider.getNationality().toString().toUpperCase());
    }

    @Test
    public void testCanUpdateRider() {
        rider.setChampionshipPoints(40);
        DBHelper.saveOrUpdate(rider);
        Rider editedRider = DBHelper.find(Rider.class, rider.getId());
        assertEquals(40, editedRider.getChampionshipPoints());
    }
}

import db.DBHelper;
import models.CountryType;
import models.Manufacturer;
import models.ManufacturerType;
import models.Team;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ManufacturerDBTest {

    private Manufacturer manufacturer;

    @Before
    public void setUp() throws Exception {
        manufacturer = new Manufacturer(ManufacturerType.YAMAHA, CountryType.JAPAN);
        DBHelper.saveOrUpdate(manufacturer);
    }

    @After
    public void tearDown() throws Exception {
        DBHelper.delete(manufacturer);
    }

    @Test
    public void testCanSaveManufacturer() {
        assertEquals(1, DBHelper.getAll(Manufacturer.class).size());
    }

    @Test
    public void testCanUpdateManufacturer() {
        manufacturer.setManufacturerName(ManufacturerType.HONDA);
        DBHelper.saveOrUpdate(manufacturer);
        Manufacturer editedManufacturer = DBHelper.find(Manufacturer.class, manufacturer.getId());
        assertEquals("HONDA", editedManufacturer.getManufacturerName().toString().toUpperCase());
    }

    @Test
    public void testCanDeleteManufacture() {
        Manufacturer manufacturer2 = new Manufacturer(ManufacturerType.DUCATI, CountryType.ITALY);
        DBHelper.delete(manufacturer2);
        assertEquals(1, DBHelper.getAll(Manufacturer.class).size());
    }
}

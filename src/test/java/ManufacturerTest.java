import db.DBHelper;
import models.CountryType;
import models.Manufacturer;
import models.ManufacturerType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ManufacturerTest {

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
}

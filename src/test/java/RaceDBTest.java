import db.DBHelper;
import models.CountryType;
import models.Race;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RaceDBTest {

    private Race race;

    @Before
    public void setUp() throws Exception {
        race = new Race("British Grand Prix", "Silverstone", CountryType.UNITED_KINGDOM, "2018-08-26");
    }

    @Test
    public void testCanSaveRace() {
        DBHelper.save(race);
        assertEquals(1, DBHelper.getAll(Race.class).size());
    }

    @Test
    public void testCanGetAllRaces() {
        Race race1 = new Race("Grand Prix of Qatar", "Losail", CountryType.QATAR, "2018-03-18");
        DBHelper.save(race1);
        Race race2 = new Race("Gran Premio Motul de la República Argentina", "Termas de Rio Hondo", CountryType.ARGENTINA, "2018-04-08");
        DBHelper.save(race2);
        Race race3 = new Race("Grand Prix of the Americas", "Circuit of the Americas", CountryType.USA, "2018-04-22");
        DBHelper.save(race3);
        Race race4 = new Race("Gran Premio Red Bull de España", "Circuito de Jerez", CountryType.SPAIN, "2018-05-06");
        DBHelper.save(race4);
        Race race5 = new Race("Grand Prix de France", "Le Mans", CountryType.FRANCE, "2018-05-20");
        DBHelper.save(race5);
        assertEquals(6, DBHelper.getAll(Race.class).size());
    }
}

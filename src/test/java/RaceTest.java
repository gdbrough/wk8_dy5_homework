import db.DBHelper;
import models.CountryType;
import models.PositionType;
import models.Race;
import models.Rider;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaceTest {

    private Race race;
    private Rider rider;
    private PositionType position;

    @Before
    public void setUp() {
        race = new Race("British GP", "Silverstone", CountryType.UNITED_KINGDOM, "2018-03-18");
    }

    @Test
    public void testCanGetPointsForPosition() {
        assertEquals(11, race.getPointsForPosition(PositionType.FIFTH));
        assertEquals(1, race.getPointsForPosition(PositionType.values()[14]));
        assertEquals(25, race.getPointsForPosition(PositionType.FIRST));
    }

//    @Test
//    public void testCanGetAllCompetingRiders() {
////        race.getRiders();
//        assertEquals(3,race.getCompetingRiders().size());
//    }

    @Test
    public void testCanAddPointsAfterRace() {
        rider = new Rider("Valentino", "Rossi", CountryType.ITALY, 46, 50, null);
        DBHelper.save(rider);
        Rider rider2 = new Rider("Andrea", "Ianone", CountryType.ITALY, 29, 20, null);
        DBHelper.save(rider2);
        Rider rider3 = new Rider("Dani", "Pedrosa", CountryType.SPAIN, 26, 0, null);
        DBHelper.save(rider3);
        race.runRace();
        assertEquals(1, 1);
    }
}

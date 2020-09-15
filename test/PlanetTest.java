import demo.Moon;
import demo.Planet;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTestOfObjectInfo
{
    public void testAddGet1(){
        Planet earth = new Planet("12",12,"earth","moon");

        assertEquals(12,earth.getSpeed());
        assertEquals("12",earth.getMass());
        assertEquals("earth",earth.getName());



    }

}
class MoonTestOfObjectInfo{

    public void testAddGetMoon(){
        Planet earth = new Planet("12",12,"earth","moon");
        Moon moon = new Moon("13", 13,"moon",earth);

        assertEquals(13, moon.getSpeed());
        assertEquals("13", moon.getMass());
        assertEquals("moon", moon.getName());

        assertEquals(1,earth.moonCount());

        }
    }

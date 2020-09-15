import demo.Planet;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTestOfObjectInfo
{
    public void testAddGet1(){
        Planet earth = new Planet("12",12,"earth");

        assertEquals(12,earth.speed)

    }

}
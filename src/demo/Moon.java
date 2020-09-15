package demo;

public class Moon extends SpaceBody
{
    Object orbits;
    public Moon(String mass, double speed, String name, Object orbits)
    {

        super(mass, speed, name);
        this.orbits = orbits;
    }

    @Override
    public String toString()
    {
        return
                super.toString() +
                ", orbits='" + orbits + '\'' +
                '}';
    }

    public Object getOrbits()
    {
        return orbits;
    }
}

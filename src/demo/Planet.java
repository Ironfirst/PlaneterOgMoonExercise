package demo;

public class Planet extends SpaceBody
{
    Object moon;
    public Planet(String mass, double speed, String name,Object moon)
    {
        super(mass, speed, name);
        this.moon=moon;

    }

    @Override
    public String toString()
    {

        return  super.toString() +
                "Planet{" +

                '}';
    }

    public int moonCount()
    {
       if(this.moon==null){
           return 0;
       }
       else return 1;
    }


}

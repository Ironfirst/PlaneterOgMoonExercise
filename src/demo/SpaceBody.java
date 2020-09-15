package demo;

abstract class SpaceBody
{
    String mass;
    double speed;
    String name;

    public SpaceBody(String mass, double speed, String name){

        this.mass = mass;
        this.speed = speed;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "SpaceBody{" +
                "mass='" + mass + '\'' +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }

    public String getMass()
    {
        return mass;
    }

    public double getSpeed()
    {
        return speed;
    }

    public String getName()
    {
        return name;
    }

    /*
    @Override
    public boolean equals(Object p){
        if(this.speed>=p.speed){
            return false;
        }
        else{
            return true;
        }
    }
    */


}

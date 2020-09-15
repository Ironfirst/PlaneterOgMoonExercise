package demo;

public class Main {

    public static void main(String[] args) {

        Planet earth = new Planet("5.972E24",67.000,"earth","moon");
        System.out.println(earth);

        Moon moon = new Moon("13", 13,"moon",earth);
        System.out.println(moon);
        System.out.println(earth.moonCount());
        System.out.println(moon.getOrbits());


    }

}

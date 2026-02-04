package ex_25_ENUM;

public class Lab200_ENUM_ADVANCE {
    public static void main(String[] args) {

        double earthGravity = Planet.EARTH.surfaceGravity();
        double mercuryGravity = Planet.MERCURY.surfaceGravity();
        System.out.println(earthGravity);
        System.out.println(mercuryGravity);
        System.out.println(Planet.valueOf("EARTH").getMass());
        System.out.println(Planet.EARTH.getMass());



    }
}

enum Planet{
    MERCURY(3.303e23, 2.4397e6),
    VENUS(4.869e24, 6.0518e6),
    EARTH(5.976e24, 6.37814e6),
    MARS(6.421e23, 3.3972e6);


    private final double mass;   // in kilograms
    private final double radius; // in meters

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() { return mass; }
    public double getRadius() { return radius; }

    public double surfaceGravity() {
        final double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }


}

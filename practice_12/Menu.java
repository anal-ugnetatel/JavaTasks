import java.util.Scanner;
import static java.lang.Math.*;

public enum Menu {

    MERCURY(3.3, 2440),
    VENUS(48.7, 6052),
    MARS(6.42, 6786),
    EARTH(59.7, 6357),
    JUPITER(19000, 71398),
    SATURN(5690, 60300),
    URANIUM(869, 23800),
    NEPTUNE(1040, 22200);

    private final double mass, radius;
    Menu(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getGravity() {
        return 6.67 * (mass * (pow(10, 6))) / (pow(radius, 2));
    }


    @Override
    public String toString() {

        return "gravity: " + getGravity();
    }
}
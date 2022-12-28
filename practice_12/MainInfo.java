
public enum  MainInfo {
    MERCURY(3.3, 2440),
    VENUS(48.7, 6052),
    EARTH(59.7, 6357),
    MARS(6.42, 6786),
    JUPITER(19000, 71398),
    SATURN(5690, 60300),
    URANIUM(869, 23800),
    NEPTUNE(1040, 22200);

    private final double mass, radius;

    MainInfo(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "name: " + name() + ": mass: " + mass + ", " + "radius: " + radius + ",";
    }
}
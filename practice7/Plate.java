class Plate extends Dish {
    protected double radius;

    Plate(double radius) {
        super.setColor("white");
        super.setMaterial("steel");
        this.radius = radius;
        System.out.println("Plate object (created)");
    }

    // Radius getter
    double getRadius() {
        return this.radius;
    }

    // Radius setter
    void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            System.out.println("Plate radius set as: " + this.radius);
        } else {
            System.out.println("Plate radius must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dish: Plate, radius: " + this.radius;
    }
}

class Teapot extends Dish {
    protected double volume;

    Teapot(String color, String material, String contains, double volume) {
        super.setColor(color);
        super.setMaterial(material);
        super.setContained(contains);
        this.volume = volume;
        System.out.println("Teapot object (created)");
    }

    void pour() {
        this.volume -= 0.1;
        System.out.println("Teapot poured one cup of " + super.getContained());
    }

    void pourOut() {
        this.volume = 0.0;
        System.out.println("Teapot poured out all " + super.getContained());
        super.setContained("nothing");
    }

    // Radius getter
    double getVolume() {
        return this.volume;
    }

    // Radius setter
    void setVolume(double volume) {
        if (volume > 0 && volume < 1) {
            this.volume = volume;
            System.out.println("Teapot volume set as: " + this.volume);
        } else {
            System.out.println("Teapot volume must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dish: Teapot, volume: " + this.volume;
    }
}

class Wardrobe extends Furniture {
    protected String contains;

    Wardrobe(String material, String color, String contains) {
        super.setMaterial(material);
        super.setColor(color);
        this.contains = contains;
        System.out.println("\nWardrobe object (created)");
    }

    // Wardrobe contains getter
    public String getContained() {
        return this.contains;
    }

    // Wardrobe contains setter
    public void setContained(String contains) {
        this.contains = contains;
        System.out.println("Wardrobe contains now: " + this.contains);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Wardrobe object: contains: " + this.contains;
    }
}

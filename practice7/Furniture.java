abstract class Furniture {
    protected String material;
    protected String color;

    Furniture() {
        this.material = "unset";
        this.color = "unset";
        System.out.println("\nFurniture abstract object (created)");
    }

    // Furniture material getter
    public String getMaterial() {
        return this.material;
    }

    // Furniture material setter
    public void setMaterial(String material) {
        this.material = material;
    }

    // Furniture color getter
    public String getColor() {
        return this.color;
    }

    // Furniture color setter
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Furniture object: material: " + this.material + ", color: " + this.color;
    }
}

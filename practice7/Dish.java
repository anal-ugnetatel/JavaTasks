abstract class Dish {
    protected String material;
    protected String color;
    protected String contains;

    Dish() {
        this.material = "unset";
        this.color = "unset";
        this.contains = "nothing";
        System.out.println("\nDish abstract object (created)");
    }

    // Dish material getter
    public String getMaterial() {
        return this.material;
    }

    // Dish material setter
    public void setMaterial(String material) {
        this.material = material;
    }

    // Dish color getter
    public String getColor() {
        return this.color;
    }

    // Dish color setter
    public void setColor(String color) {
        this.color = color;
    }

    // Dish contains getter
    public String getContained() {
        return this.contains;
    }

    // Dish contains setter
    public void setContained(String contains) {
        this.contains = contains;
        System.out.println("Dish contains: " + this.contains);
    }

    public String toString() {
        return "Dish object: material: " + this.material + ", color: " + this.color + ", contains: " + this.contains;
    }
}

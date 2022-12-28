abstract class Shape {
    private String color;

    Shape() {
        System.out.println("\nAdded Shape abstract object (created)");
    }

    Shape(String color) {
        this.color = color;
        System.out.println("\nAdded Shape object (created)");
    }

    // Color getter
    String getColor() {
        return this.color;
    }

    // Color setter
    void setColor(String color) {
        this.color = color;
        System.out.println("Shape color set as: " + this.color);
    }

    // Area getter
    double getArea() {
        return 0.0;
    }

    // Perimeter getter
    double getPerimeter() {
        return 0.0;
    }

    public String toString() {
        return "Shape object with color: " + this.color;
    }
}

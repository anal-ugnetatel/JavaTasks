class Circle extends Shape {
    protected double radius;


    Circle(double radius, String color, boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
        this.radius = radius;
        System.out.println("Added Circle object (created)");
    }

    // Radius getter
    double getRadius() {
        return this.radius;
    }

    // Radius setter
    void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            System.out.println("Circle radius set as: " + this.radius);
        } else {
            System.out.println("Circle radius must be more than 0");
        }
    }

    @Override
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: circle; radius: " + getRadius() + ", perimeter: " + getPerimeter();
    }
}

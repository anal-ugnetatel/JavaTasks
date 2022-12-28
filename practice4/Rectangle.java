class Rectangle extends Shape {
    protected double sideA;
    protected double sideB;

    Rectangle() {
        super.setColor("blue");
        super.setFilled(false);
        System.out.println("Added Rectangle object (created)");
    }



    Rectangle(double width, double length, String color, boolean filled) {
        super.setColor("blue");
        super.setFilled(false);
        this.sideA = width;
        this.sideB = length;
        System.out.println("Added Rectangle object (created)");
    }

    // Width getter
    double getWidth() {
        return this.sideA;
    }

    // Width setter
    void setWidth(double width) {
        if (width > 0) {
            this.sideA = width;
            System.out.println("Rectangle width set as: " + this.sideA);
        } else {
            System.out.println("Rectangle width must be more than 0");
        }
    }

    // Length getter
    double getLength() {
        return this.sideB;
    }

    // Width setter
    void setLength(double length) {
        if (length > 0) {
            this.sideB = length;
            System.out.println("Rectangle length set as: " + this.sideB);
        } else {
            System.out.println("Rectangle length must be more than 0");
        }
    }

    @Override
    double getArea() {
        return this.sideB * this.sideA;
    }

    @Override
    double getPerimeter() {
        return 2 * (this.sideB + this.sideA);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: rectangle, length: " + this.sideB + ", width: " + this.sideA;
    }
}

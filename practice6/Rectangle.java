class Rectangle extends Shape {
    protected double length;
    protected double width;

    Rectangle() {
        super.setColor("black");
        System.out.println("Added Rectangle object (created)");
    }
    Rectangle(double length, double width){
        super.setColor("white");
        this.length = length;
        this.width = width;
        System.out.println("Added Rectangle object (created)");
    }
    double getLength() {
        return this.length;
    }
    double getWidth() {
        return this.width;
    }
    void setLength(double length) {
        if (length > 0) {
            this.length = length;
            System.out.println("Rectangle length set at: " + this.length);
        }
        else {
            System.out.println("length must be more than 0");
        }
    }
    void setWidth(double width) {
        if (length > 0) {
            this.width = width;
            System.out.println("Rectangle width set at: " + this.width);
        }
        else {
            System.out.println("width must be more than 0");
        }
    }

    @Override
    double getArea() {
        return this.length * this.width;
    }
    @Override
    double getPerimeter() {
        return 2 * (this.length + this.width);
    }
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: rectangle, length: " + this.length + ", width: " + this.width;
    }
}
interface Mobile {
    void moveUp();
    void moveDown();
    void moveRight();
    void moveLeft();
}

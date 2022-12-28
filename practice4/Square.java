class Square extends Rectangle{

    Square(double side, String color, boolean filled) {
        super.setColor("blue");
        super.setFilled(false);
        this.sideA = side;
        this.sideB = side;
        System.out.println("Added Square object (created)");
    }

    // Side getter
    double getSide() {
        return this.sideA;
    }

    // Side setter
    void setSide(double side) {
        if (side > 0) {
            this.sideA = side;
            this.sideB = side;
            System.out.println("Square side set as: " + this.sideA);
        } else {
            System.out.println("Square side must be more than 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: square, side: " + this.sideA;
    }
}

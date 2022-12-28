class MobileC implements Mobile {
    private int radius;
    private MobileP center;

    MobileC(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.center = new MobileP(x, y, xSpeed, ySpeed);
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
        System.out.println("Added MobileCircle (created)");
    }

    public String toString() {
        return "MobileCircle - radius: " + this.radius + ", center at: " + center;
    }

    public void moveUp() {
        this.center.moveUp();
        System.out.println("MobileCircle moved up");
    }

    public void moveDown() {
        this.center.moveDown();
        System.out.println("MobileCircle moved down");
    }

    public void moveLeft() {
        this.center.moveLeft();
        System.out.println("MobileCircle moved left");
    }

    public void moveRight() {
        this.center.moveRight();
        System.out.println("MobileCircle moved right");
    }
}

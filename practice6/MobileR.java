class MobileR implements Mobile {
    private MobileP topRight;
    private MobileP bottomLeft;

    MobileR(int x1, int y1, int x2, int y2, int xLineSpeed, int yLineSpeed) {
        this.topRight = new MobileP(x1, y1, xLineSpeed, yLineSpeed);
        this.bottomLeft = new MobileP(x2, y2, xLineSpeed, yLineSpeed);
        System.out.println("Added MobileRectangle object (created)");
    }
    public String toString() {
        return "MobileRectangle object: top right: " + this.topRight + ", bottom left: " + this.bottomLeft;
    }
    public void moveDown() {
        this.topRight.moveDown();
        this.bottomLeft.moveDown();
        System.out.println("MobileRectangle moved down");
    }
    public void moveUp() {
        this.topRight.moveUp();
        this.bottomLeft.moveUp();
        System.out.println("MobileRectangle moved up");
    }
    public void moveRight() {
        this.topRight.moveRight();
        this.bottomLeft.moveRight();
        System.out.println("MobileRectangle moved right");
    }
    public void moveLeft() {
        this.topRight.moveLeft();
        this.bottomLeft.moveLeft();
        System.out.println("MobileRectangle moved left");
    }
}

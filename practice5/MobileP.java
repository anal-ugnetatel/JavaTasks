class MobileP implements Mobile {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MobileP(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        System.out.println("\nAdded MovablePoint (created)");
    }

    public String toString() {
        return "MobilePoint - x: " + this.x + ", y: " + this.y + ", xLineSpeed: " + this.xSpeed + ", yLineSpeed: " + this.ySpeed;
    }

    public void moveUp() {
        this.y += this.ySpeed;
        System.out.println("MobilePoint moved up by " + this.ySpeed);
    }

    public void moveDown() {
        this.y -= this.ySpeed;
        System.out.println("MobilePoint moved down by " + this.ySpeed);
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
        System.out.println("MobilePoint moved left by " + this.xSpeed);
    }

    public void moveRight() {
        this.x += this.xSpeed;
        System.out.println("MobilePoint moved right by " + this.xSpeed);
    }
}

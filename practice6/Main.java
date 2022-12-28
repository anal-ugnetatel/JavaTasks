public class Main {
    public static void main(String[] args) {
        MobileR mobileRectangle = new MobileR(7, 8, 0,0, 1, 1);
        System.out.println(mobileRectangle);
        mobileRectangle.moveUp();
        mobileRectangle.moveUp();
        mobileRectangle.moveRight();
        mobileRectangle.moveDown();
        System.out.println(mobileRectangle);
        mobileRectangle.moveDown();
        mobileRectangle.moveDown();
        mobileRectangle.moveDown();
        mobileRectangle.moveDown();
        mobileRectangle.moveLeft();
        mobileRectangle.moveLeft();
        System.out.println(mobileRectangle);
    }
}
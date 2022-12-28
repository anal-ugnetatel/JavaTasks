public class Main {
    public static void main(String[] args) {
        //testing movement
        MobileC mobileCircle = new MobileC(7, 4, 3, 2, 1);
        System.out.println(mobileCircle);
        mobileCircle.moveUp();
        mobileCircle.moveUp();
        mobileCircle.moveRight();
        mobileCircle.moveDown();
        System.out.println(mobileCircle);
        mobileCircle.moveDown();
        mobileCircle.moveDown();
        mobileCircle.moveDown();
        mobileCircle.moveDown();
        mobileCircle.moveLeft();
        mobileCircle.moveLeft();
        System.out.println(mobileCircle);
    }
}
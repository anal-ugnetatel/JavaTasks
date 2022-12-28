public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(4);
        System.out.println(plate);
        plate.setContained("meat");
        plate.setRadius(7);
        System.out.println(plate);

        Teapot teapot = new Teapot("red", "steel", "tea", 1);
        System.out.println(teapot);
        teapot.pour();
        teapot.pour();
        teapot.pour();
        System.out.println(teapot);
        teapot.pourOut();
        System.out.println(teapot);

        Table table = new Table("wood", "black", "dinner");
        System.out.println(table);

        Wardrobe wardrobe = new Wardrobe("wood", "black", "jacket");
        System.out.println(wardrobe);
        wardrobe.setContained("narnia");
        System.out.println(wardrobe);

        FurnitureShop furniture_shop = new FurnitureShop();
        furniture_shop.addFurniture(wardrobe);
        furniture_shop.addFurniture(table);
        System.out.println(furniture_shop);
    }
}

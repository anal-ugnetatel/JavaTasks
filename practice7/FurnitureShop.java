import java.util.*;
class FurnitureShop {
    private List<Furniture> furnitureShopArray = new ArrayList<Furniture>();

    {
        System.out.println("\nFurniture shop object (created)");
    }

    // Add one Furniture
    public void addFurniture(Furniture furniture) {
        this.furnitureShopArray.add(furniture);
        System.out.println(furniture + ". This item added into the furniture shop successfully!");
    }

    public String toString() {
        if (!this.furnitureShopArray.isEmpty())
            return "Furniture shop: " + this.furnitureShopArray;
        else
            return "Furniture shop empty!";
    }
}

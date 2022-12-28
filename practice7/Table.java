class Table extends Furniture {
    protected String contains;

    Table(String material, String color, String contains) {
        super.setMaterial(material);
        super.setColor(color);
        this.contains = contains;
        System.out.println("\nTable object (created)");
    }

    // Table contains getter
    public String getContained() {
        return this.contains;
    }

    // Table contains setter
    public void setContained(String contains) {
        this.contains = contains;
        System.out.println(this.contains + " on table now");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Table object: on table: " + this.contains;
    }
}

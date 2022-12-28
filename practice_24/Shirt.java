public class Shirt {
    private String article, fullName, colour, size;

    public Shirt(String stringParse){
        String[] s = stringParse.split(",");
        article = s[0];
        fullName = s[1];
        colour = s[2];
        size = s[3];
    }

    @Override
    public String toString() {
        return "Shirt:" +
                "\tarticle='" + article + '\'' +
                "\n\t\tfullName='" + fullName + '\'' +
                "\n\t\tcolour='" + colour + '\'' +
                "\n\t\tsize='" + size + '\'';
    }

    public static void main(String[] args) {
        String[] strs = new String[]{
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };
        Shirt[] shirts = new Shirt[strs.length];
        for (int i = 0; i < strs.length; i++) {
            shirts[i] = new Shirt(strs[i]);
            System.out.println(shirts[i]);
        }
    }
}
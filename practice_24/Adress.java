import java.util.StringTokenizer;

public class Adress {
    private String country, region, city, street, house, housing, flat;

    public Adress(String stringToParse, boolean multiDivider){
        if(stringToParse == null) throw new NullPointerException();
        String[] s;
        if(multiDivider){
            StringTokenizer st = new StringTokenizer(stringToParse, ",.;");
            s = new String[st.countTokens()];
            int i = 0;
            while(st.hasMoreTokens()) s[i++] = st.nextToken();
        }else{
            s = stringToParse.split(",");
        }

        if(s.length < 7) throw new IllegalArgumentException("Строка содержит недостаточно данных!");
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString() {
        return "Address: " +
                "country = '" + country + '\'' +
                ", region = '" + region + '\'' +
                ", city = '" + city + '\'' +
                ", street ='" + street + '\'' +
                ", house = '" + house + '\'' +
                ", housing = '" + housing + '\'' +
                ", flat ='" + flat + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Adress t1 = new Adress("Россия, МО   ,    Москва, проспект Вернадского, 78, 7, А10", false);
        Adress t2 = new Adress("USSR,      Ленинградская обл., Leningrad.    Nevskiy prospect; 1;2;23", true);
        Adress t3 = new Adress("UK, London, London, Trafalgar square, 2, 3, 4, other string,,,", false);
        Adress t4 = new Adress("Страна; регион;   город  . Улица, дом; корпус. Квартира", true);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

    }
}
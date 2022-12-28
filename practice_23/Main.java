import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Pinkman","Jesse");
        map.put("McCree","Jesse");
        map.put("Thorndyke","Chris");
        map.put("White","Walter");
        map.put("Riddle","Tom");
        map.put("Disney","Walter");
        map.put("Prevost","Marie");
        map.put("Curie","Marie");
        map.put("Bell","Marie");
        map.put("Albon","Alexander");

        return map;
    }

    public static void removeNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> s : copy.entrySet())
        {
            for (Map.Entry<String, String> s2 : copy.entrySet())
            {
                if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) removeItem(map,s.getValue());
            }
        }
    }

    public static void removeItem(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        map.forEach((key, value) -> System.out.print(key + ", " + value + "; "));
        System.out.println();
        System.out.println("Deleting repeating names...");
        removeNameDuplicates(map);
        map.forEach((key, value) -> System.out.print(key + ", " + value + "; "));
    }
}
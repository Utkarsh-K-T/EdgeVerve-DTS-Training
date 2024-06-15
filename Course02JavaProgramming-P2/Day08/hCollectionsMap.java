/*
Map : 
-key values (key must be unique balues may duplicated)

HashMap
LinkedHashMap
SortedMap -> TreeMap

*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class hCollectionsMap 
{
    public static void main(String[] args)
    {
        Map <String,String> map = new HashMap<>();
        map.put("id","al01");
        map.put("name","Ram");
        map.put("designation","VIP");
        System.out.println("HashMap");
        System.out.println(map);//unordered does not maintians sequence
        System.out.println(map.get("name"));
        map.put("lastname","Ram");
        System.out.println(map);

        Map <String,String> map1 = new LinkedHashMap<>();
        map1.put("id","al01");
        map1.put("name","Ram");
        map1.put("designation","VIP");
        System.out.println("LinkedHashMap");
        System.out.println(map1);//sequence is maintained

        Map <String,String> map2 = new TreeMap<>();
        map2.put("id","al01");
        map2.put("name","Ram");
        map2.put("designation","VIP");
        System.out.println("TreeMap");
        System.out.println(map2);//sorted in ascending ordder

        //Traversing is not possible directly so HashSet is used!
        //Traversing : Type1 using HashSet
        Set<String> keys = new HashSet<>();
        keys = map.keySet();
        System.out.println("Traversing Type 1");
        for(String key: keys)
        {
            System.out.println(key+" : "+map.get(key));
        }
        //Traversing : Type2 using Map.Entry
        System.out.println("Traversing Type 2");
        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey()+" : "+m.getValue());
        }

        //Traversing : Type3 using forEach
        System.out.println("Traversing Type 3");
        BiConsumer<String, String> bCon = new BiConsumer<String,String>() 
        {
            @Override
            public void accept(String t, String u) 
            {
                System.out.println(t+" : "+u);
            }
        };
        map.forEach(bCon);
        System.out.println("Traversing Type 3 with Lambda");
        map.forEach((key, value)-> System.out.println(key+" : "+value));
    }
}

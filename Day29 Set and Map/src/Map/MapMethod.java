package Map;

import java.security.PublicKey;
import java.util.*;

public class MapMethod {
    public static void main(String [] args){
        Map<Integer ,String > map = new HashMap<>();
        map.put(101 ,"Kishan");
        map.put(102 ,"Aditya");
        map.put(103 ,"Rohan");
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());

        //in the map there is two method of the contains
       // System.out.println(map.containsKey(101));//O(1)
       // System.out.println(map.containsValue("Kishan"));//O(N)

//        System.out.println(map.get(101));
        //return null fe new insertion
//        System.out.println(map.put(104 , "Raj"));
        //return privious value of already present value present
//        System.out.println(map.put(103 , "Swan"));

//        map.remove(101);
//        Map<Integer , String>map2 =new HashMap<>();
//        map.putAll(map2);
//        map.clear();


        //*****Most importent method of maps*******
        //return the uniques as the set
//        Set<Integer> set = map.keySet();
//        System.out.println(set);
//        //return all the value as a collection
//        Collection<String > C = map.values();
//        System.out.println(C);
//         Set<Map.Entry<Integer , String >> entry = map.entrySet();
//        System.out.println(entry);

        //find value if not present give the default value
//        System.out.println(map.getOrDefault(102 , "NotPresent"));
        //it only put the new vlaue and dose not replace the privious value
//        map.putIfAbsent(102 ,"Raj");
//        System.out.println(map);
        //remove if the value and key both matches
//        map.remove(102 ,"Aditya");
        //it only replace the existing and dose not insert the new value
//        map.replace(101 ,"kishan");
//        map.replace(101,"Kishan" ,"Raj");
//        System.out.println(map);

//         Set<Map.Entry<Integer, String>> entries =map.entrySet();
//         for(Map.Entry<Integer , String> entry:entries){
//             Integer key = entry.getKey();
//             String value = entry.getValue();
//             System.out.println(key+"-> "+ value);
//         }
        //immutable map
        Map<Integer , String> map2 = Map.of(101 , "Kishan" , 102 ,"Ganesh");
        System.out.println(map2);
    }
}

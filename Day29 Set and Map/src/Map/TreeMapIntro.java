package Map;
import java.util.*;
public class TreeMapIntro {
    public static void main(String[] args){
        TreeMap<Integer ,String> map =new TreeMap<>();
        map.put(101 ,"Kishan");
        map.put(102 , "Aditya");
        map.put(103 ,"Rohan");
//mehtod came from the navigable map
//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
//        System.out.println(map.firstEntry());
//        System.out.println(map.lastEntry());

//        System.out.println(map.headMap(101));
//        System.out.println(map.tailMap(101));

//        System.out.println(map.subMap(101 ,104 ));

        //sortd set
//        System.out.println(map.lowerKey(102));
//        System.out.println(map.lowerEntry(102));
//        System.out.println(map.higherKey(102));
//        System.out.println(map.higherEntry(102));

//        System.out.println(map.pollFirstEntry());
//        System.out.println(map.pollLastEntry());

//        System.out.println(map.descendingMap());

        System.out.println(map.headMap(102 , true));
        System.out.println(map.tailMap(102 , true));
        System.out.println(map.subMap(102 , true ,103  ,true));
    }
}

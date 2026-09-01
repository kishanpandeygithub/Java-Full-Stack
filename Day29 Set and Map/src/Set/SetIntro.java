package Set;
import java.util.*;
import java.util.HashSet;

public class SetIntro {
    public static void main(String[] args){
        Set<String> set =new HashSet<>();
        set.add("Kishan");
        set.add("Rohit");
        set.add("Rohan");
        System.out.println(set.contains("Kishan"));

        Map<Integer , String> map =new HashMap<>();
        map.put(10 , "Kishan");
        map.put(12 ,"Aditya");
        map.put(13 ,"Raj");
        System.out.println(map.containsKey(101));
        System.out.println(map.get(10));
    }
}

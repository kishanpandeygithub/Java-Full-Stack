package Map;

import java.util.*;

public class HAshmapLinkedHashMap {
    public static void main(String [] args){
        //HashMap//LinkedHashMap
        Map<Integer , String > map= new HashMap<>();
        //with capacity
        Map<Integer , String > map2= new HashMap<>(100);
        //capacity with loadfactor
        Map<Integer , String > map3= new HashMap<>(100 ,0.8f);
        //from different map or collection
        Map<Integer , String > map4= new HashMap<>(Map.of(101 , "Kishan"));

        //HashMap//LinkedHashMap
        Map<Integer , String > Lmap= new LinkedHashMap<>();
        //with capacity
        Map<Integer , String > Lmap2= new LinkedHashMap<>(100);
        //capacity with loadfactor
        Map<Integer , String > Lmap3= new LinkedHashMap<>(100 ,0.8f);
        //from different map or collection
        Map<Integer , String > Lmap4= new LinkedHashMap<>(Map.of(101 , "Kishan"));

    }
}

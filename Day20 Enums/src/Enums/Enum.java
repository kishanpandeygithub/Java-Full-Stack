package Enums;

public class Enum {
    public static void main(String[] args){
        Directions[] directions =Directions.values();
        for(Directions d: directions){
             System.out.println(d.name());
        }
        Directions d = Directions.valueOf("EAST");
        System.out.println(d.name());
    }
}

//values()--> it return the all the values of array of enum
//valuesOf()--> converts a string into an enum constants
//name() -->return the name of the Object but can't be override
//ordinal()--> return the index of the object
enum Directions{
    NORTH ,
    SOUTH,
    EAST,
    WEST
}
package Enums;

public class EnumValus {
    public static void main(String [] args){
//        Directions d =new NorthDirection();
//        d.move();
//        Directions s =new SouthDirection();
//        s.move();

        Direction d = Direction.NORTH;
        d.move();

    }
}
enum Direction{
    NORTH{
        @Override
        public void move(){
            System.out.println("Move to up(Y+1)");
        }
    },
    SOUTH{
        @Override
        public void move(){
            System.out.println("Move to down(Y-1)");
        }
    },
    EAST{
        @Override
        public void move(){
            System.out.println("Move to left(x+1)");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("Move to right(x-1)");
        }
    };
    public abstract void move();
}

//abstract class Directions{
//    public abstract void move();
//}
//class NorthDirection extends  Directions{
//    @Override
//    public void move(){
//        System.out.println("Move to North");
//    }
//}class SouthDirection extends  Directions{
//    @Override
//    public void move(){
//        System.out.println("Move to South");
//    }
//}
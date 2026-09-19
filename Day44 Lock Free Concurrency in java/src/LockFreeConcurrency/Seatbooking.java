package LockFreeConcurrency;

import java.util.concurrent.atomic.AtomicReference;

public class Seatbooking {
    public static void main(String[] args){
        SeatBookingDemo sb = new SeatBookingDemo();
        Thread t1 = new Thread(()->{
            boolean value =  sb.bookSeat("Kishan");
            System.out.println("T1 Says " +value);
        });
        Thread t2 = new Thread(()->{
            boolean value =  sb.bookSeat("Aditya");
            System.out.println("T2 Says " +value);
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println(sb.seat);
    }
}

class SeatBookingDemo{
    AtomicReference<String > seat = new AtomicReference<>("Empty");

    boolean bookSeat(String name){
        String current = seat.get();
        if(current.equals("Empty")==false){
            return false;
        }
        return seat.compareAndSet("Empty" , name);
    }
}

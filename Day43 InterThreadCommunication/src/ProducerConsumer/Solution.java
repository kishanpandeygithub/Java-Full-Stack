package ProducerConsumer;

public class Solution {
    public static void main(String [] args){
        Box box = new Box();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(100);
                    box.producer(10);
                } catch (InterruptedException e) {
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(70);
                    box.Consumer();
                } catch (InterruptedException e) {
                }
            }
        });
        t1.start();
        t2.start();
    }
}


class Box {
    volatile Integer item;
    volatile Boolean flag = false;

     synchronized void producer(int x) {
        while (flag==true){
            try{
                wait();
            }
            catch (InterruptedException e){}
        }
        item = x;
        flag = true;
        System.out.println("Producer produces " + item);
        notify();
    }

     synchronized void Consumer() {
        while (flag ==false){
            try{
                wait();
            }
            catch (InterruptedException e){ }
        }
        System.out.println("Consumer Consumes " + item);
        item = null;
        flag = false;
        notify();
    }
}

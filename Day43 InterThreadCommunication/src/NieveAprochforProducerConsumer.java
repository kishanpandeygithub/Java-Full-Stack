public class NieveAprochforProducerConsumer {
    public static void main(String [] args){
        Box box = new Box();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                box.producer(10);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                box.Consumer();
            }
        });
        t1.start();
        t2.start();
    }
}

class Box {
    volatile Integer item;
    volatile Boolean flag = false;

    void producer(int x) {
        while (flag==true){
        }
        item = x;
        flag = true;
        System.out.println("Producer produces " + item);
    }

    void Consumer() {
        while (flag ==false){
        }
        System.out.println("Consumer Consumes " + item);
        item = null;
        flag = false;
    }
}

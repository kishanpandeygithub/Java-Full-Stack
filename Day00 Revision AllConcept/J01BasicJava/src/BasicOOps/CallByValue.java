package BasicOOps;
class Random{
    int x;
    int y;
    Random(int x , int y){
        this.x  =x;
        this.y = y;
    }
    Random(Random r){
        this.x = r.x;
        this.y =r.y;
    }
}
public class CallByValue {
    public static void  main(String[] args){
        //call by value
        int a = 10;
        int b = 30;
        change(a ,b);
        System.out.println(a +" "+ b);
       //call by reference
        Random r = new Random(2 , 3);
        changeReference(r);
        System.out.println(r.x +" "+ r.y);

        //shallow copy and the deep copy
        //shallow copy: in this we createt he new object by just pointion the adderess of the
        //privious object the change in the first object reflect on the second object

        Random r1  = new Random(2 , 3);
        //this is the shallow copy
        Random r3 = r1;
        //Deep cpoy:in this we create the totay new object using the privious one
        //means the change in the second one dose not reflect in the first one
        //this is the deep copy
        Random r2 =  new Random(r1);

    }
    static void change(int a ,int b){
        a+=2;
        b+=5;
    }
    static void changeReference(Random r){
        r.x+=10;
        r.y+=10;
    }
}

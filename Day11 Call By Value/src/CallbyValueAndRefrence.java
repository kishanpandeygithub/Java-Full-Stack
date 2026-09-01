public class CallbyValueAndRefrence {
    //in the java there is no any concept of the call by refrence  ,
    //we pass the reprence object but the copy create but the copy point the
    //same memory in heap copyed  by the privious object

    public static void main(String[] args) {
        int x =10;
        int y =20;
        System.out.println(x +" " +y);
        addTen(x ,y);
        System.out.println(x +" " +y);
        Random r1 = new Random(4 , 5);
        System.out.println(r1.x +" " +r1.y);
        r1.addTen();
        System.out.println(r1.x +" " +r1.y);
        //shallow and the deep copy
//        this is the example of the shallow copy
        // in the shallow copy the change in the object reflect in the parent object
        Random r2 = r1;
        // is the deep copy the change in this object dose not reflect in the parent
        Random r3 = new Random(r1);
        r2.addTen();
        System.out.println(r1.x +" " +r1.y);
        System.out.println(r2.x +" " +r2.y);
        System.out.println(r3.x +" " +r3.y);

    }
    //this is the call by value
    static  void addTen(int a , int b){
        a+=10;
        b+=10;
    }
}
class  Random{
    int x;
    int y;
    Random(int x ,int y) {
        this.x = x;
        this.y = y;
    }
    Random(Random r){
        this.x = r.x;
        this.y = r.y;
    }
    void addTen(){
        x+=10;
        y+=10;
    }
}

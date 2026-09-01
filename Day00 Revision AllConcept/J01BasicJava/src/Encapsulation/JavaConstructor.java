package Encapsulation;

public class JavaConstructor {
    public static void main(String[] args){
        employee e = new employee(10);

        int i;
        System.out.println(i);
    }
}
class employee{
    int id;
    employee(int val){
        System.out.println(id);
        id =val;
    }
}

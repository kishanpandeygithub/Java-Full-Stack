import java.util.Stack;
class  Student{
    //if we do not assign the values to them the default vlaus are assigned to them
    String name;//instacce variable have the default vlaues
    int rollNumber;
    int age;
    String college;
    Student(){//this is the non parametarized consrtuctor
    }
    Student(String n ,int a , int r , String c){
        name=n ;
        rollNumber=a;
        age= r;
        college=c;
    }
    void markAttandance(){
        System.out.println("Attnadence marked by " +name);
    }
    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollNumber);
        System.out.println(college);
    }
}
public class Constructor {
    public static void main(String[] args){
//        Student s1 = new Student();
//        s1.name="Kishan";
//        s1.age = 21;
//        System.out.println(s1.name);
//        System.out.println(s1.age);
//        System.out.println(s1.rollNumber);
//        System.out.println(s1.college);\

        s1.markAttandance();
        s1.print();
    }
}

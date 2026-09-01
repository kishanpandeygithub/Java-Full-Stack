package BasicOOps;
public class StaticFinal {
    public static void main(String [] args){
        //static keyword
        //the static keyword is the value that is not associated with the object but it is directly associated
        //wiht the class property:: so it is not created for the every object
//        Student1 s1 = new Student1();

    }
}
class Student1{
    String name;
    int age;
    int rollNumber;
    static String college;//if there the college is same for all the object so u can use the static keyword
    //we can also create the static method :
    /*
    *one static mehtod can only call the other static method
    * static method can only use the static variables
    * static method can not access the this keyword
    */
    Student1(String name ,int age , int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    static {
        college = "KIT";
    }
}

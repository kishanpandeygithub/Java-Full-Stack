package Inheritance;

public class InhetitanceIntro {
    public static void main(String[] args){
        //Inheritance in the java
        /*
        ::Inheritace is the core principle of the programming that allow the class to aquire
        or inherit the all the instance and the method of the super or parent class
        the process of the acquiring or inheriting called the inheritance
         */
        EngineeringStudent es =new EngineeringStudent("kishan" ,23);
        es.markAttandance();
        es.attandanceLab();
        System.out.println(es.name);

    }
}

class Student{
    String name;
    int age;
    Student(String name , int age){
        this.age =age;
        this.name = name;
    }
    void markAttandance(){
        System.out.println("The attadance is marked");
    }
}
class EngineeringStudent extends Student{
   EngineeringStudent(String name , int age){
       super(name , age);
   }
    void attandanceLab(){
        System.out.println("Attandance lab");
    }
}
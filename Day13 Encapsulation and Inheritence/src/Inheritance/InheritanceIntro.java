package Inheritance;

public class InheritanceIntro {
    public static void main(String[] args){
        EngineeringStudent es =new EngineeringStudent();
        Student s =new Student();
        es.Name ="Kishan";
        es.age =10;
        es.rollNumber =100;
        es.MarkAttandance();
        es.AttandLab();
        s.Name = "kishan";

        CSEEngineeringStudent Cse =new CSEEngineeringStudent();
        Cse.Name ="aaka";
        Cse.Subject();

    }
}
class Student{
    //class A
    protected String Name;
    int age;
    int rollNumber;
    int x;
    void MarkAttandance(){
        System.out.println(this.Name +" maeksed his attandance");
        System.out.println(Name);
        System.out.println(age);
        System.out.println(rollNumber);
    }
}
//this is the hierarcal inheritanse
class EngineeringStudent extends Student{
    String College;
    int x;
    void AttandLab(){

        System.out.println(this.Name +" Attand the lab");
        super.MarkAttandance();
        System.out.println(x);
    }
}class MadicalStudent extends Student{
    void AttandMadicalLab(){
        System.out.println(this.Name +" Attand the Madical lab");
    }
}
//miltilevel inheritance
class CSEEngineeringStudent extends EngineeringStudent{
    void Subject(){
        System.out.println(this.Name +" Attand the Subject");
    }
}

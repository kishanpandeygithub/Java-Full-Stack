package Immutable;

public class ImmutableClass {
    public static void main(String[] args){
        College college =new College("KIT" , "Varanasi");
        college.name = "PanBahar";
        Student s1 = new Student(21 , "kishan" ,  college);
        System.out.println(s1.getAge());
        System.out.println(s1.getname());

        System.out.println(college.name);
    }
}
//Not purely  Immutable class
final class Student {
    //all the variable are the final
    private final int age;
    private final String  name;
    private final College college;
    Student(int age , String name , College college){
        this.age = age;
        this.name =name;
        this.college =college;
    }
    //no setters

    public int getAge() {
        return age;
    }
    public String getname(){
        return name;
    }
    public College getCollege(){
        return college;
    }
}
//Mutable class
class College{
    String name;
    String address;
    College(String name , String address){
        this.name =name;
        this.address = address;
    }

}
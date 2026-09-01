public class CompleteMutable {
    public static void main(String[] args){
        College c = new College("Kit" , "Varanasi");
        Student s =new Student(12 , "Ganesh" , c);
        c.name = "asdfgtyukil";
        System.out.println(s.getCollege().name);
        System.out.println(s.getAge());
        System.out.println(s.getname());

    }
}
//for making it pure immutable we have to do the defencive copy

final class Student {
    //all the variable are the final
    private final int age;
    private final String  name;
    private final College college;
    Student(int age , String name ,College college){
        this.age = age;
        this.name =name;
        this.college =new College(college.name , college.address);
    }
    //no setters

    public int getAge() {
        return age;
    }
    public String getname(){
        return name;
    }
    public College getCollege(){
        return new College(college.name , college.address);
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
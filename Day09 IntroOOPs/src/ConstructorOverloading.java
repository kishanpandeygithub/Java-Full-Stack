public class ConstructorOverloading {
    public static void  main(String[] args){
        Student s1  = new Student();
        System.out.println(s1.college);
    }
}
class student{
    String name;
    int age;
    int rollNumber;
    String college;
    student(){
        this.name = "kishan";
        this.age =12;
        this.rollNumber = 101;
        this.college ="KIT";
    }
}

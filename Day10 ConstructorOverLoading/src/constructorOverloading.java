public class constructorOverloading {
    public static void  main(String[] args){
        student s1  = new student();
        System.out.println(s1.college);
    }
}
class student{
    String name;
    int age;
    int rollNumber;
    String college;
    student(){
        this("kishan");
    }
    student(String name){
        this(name , 10);
    }
    student(String name , int age){
        this(name , age , 12);
    }
    student(String name , int age ,int rollNumber){
        this(name , age ,rollNumber , "kit");
    }
    student(String name , int age , int rollNumber , String college){
        this.name =name;
        this.age =age;
        this.rollNumber = rollNumber;
        this.college =college;
    }

}

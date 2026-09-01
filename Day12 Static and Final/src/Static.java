public class Static {
    public static void  main(String[] args){
        Student s1 =new Student("kishan"  , 10 , 10);
        System.out.println(s1.name+ ", " +s1.age+" ,"+s1.rollNumber +" ,"+ s1.college);
        System.out.println(Student.college);

    }

}
class Student{
    String name;
    int age ;
    int rollNumber;
    static String college;
    Student(String name , int age ,int rollNumber ){
        this.name = name;
        this.age =age;
        this.rollNumber =rollNumber;
        //we can not assign the college here
    }
    //static bloch
    static{
        college ="kit";
    }
}
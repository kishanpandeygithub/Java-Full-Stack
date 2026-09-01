package OOPs;
class Student{
    String name;
    int age;
    int rollNumber;
    String college;
    void markAttendence(){
        System.out.println("Attandance marked by "+name);
    }
    void print(){
        System.out.println(name+" "+ age+" "+ rollNumber+" "+college);
    }
}
public class Introduction {

    public static  void main(String[] args){
        Student s1 =new Student();
        s1.name ="Kishan";
        s1.rollNumber= 101;
        s1.college = "KIT";
        s1.age = 21;
        s1.markAttendence();
        s1.print();
        Student s2 = new Student();
        s2.name ="raj";
        s2.rollNumber= 102;
        s2.college = "KIT";
        s2.age = 23;
        s2.markAttendence();
        s2.print();
    }
}

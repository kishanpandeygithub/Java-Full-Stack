//import college.teacher;
//import college.student;
//import college.*;
//import school.*;
//import  school.student;
public class Outer {
    public static void main(String[] args){
        college.student s =new college.student();
        s.print();

        school.student  s2 = new school.student();
        s2.print();
    }
}

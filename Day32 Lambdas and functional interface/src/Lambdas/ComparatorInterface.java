package Lambdas;
import java.util.*;

public class ComparatorInterface {
     public static void main(String[] args){
         List<Student> list = new ArrayList<>();
         list.add(new Student("Kishan" , 102 ,80));
         list.add(new Student("Rajesh" , 103 ,81));
         list.add(new Student("Aditya" , 104 ,87));
         list.add(new Student("Shyam" , 105 ,91));

//         Comparator<Student> c1 = new SortByName();
//         Comparator<Student> c2 = new SortByMarks();
//         Comparator<Student> c3 = new SortByRollNumber();
//
//         Collections.sort(list  , c2);//can not sort due to not define how to sort

         Collections.sort(list , (s1 , s2)-> s1.name.compareTo(s2.name )  );
         for(Student s: list){
             System.out.println(s.name+" , "+s.marks+" , "+s.rollNo );
         }
     }
}
class SortByName implements Comparator<Student>{
    @Override
    public  int compare(Student s1 ,Student s2){
        return s1.name.compareTo(s2.name);
    }
};
class SortByMarks implements Comparator<Student>{
    @Override
    public  int compare(Student s1 ,Student s2){
        return s1.marks-s2.marks;
    };
};
class SortByRollNumber implements Comparator<Student>{
    @Override
    public  int compare(Student s1 ,Student s2){
        return s1.rollNo-s2.rollNo;
    };
};

class Student {
    String name;
    int rollNo;
    int marks;
    public Student(String name , int rollNo ,int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
//class Student implements Comparable<Student>{
//    String name;
//    int rollNo;
//    int marks;
//    public Student(String name , int rollNo ,int marks){
//        this.name =name;
//        this.rollNo = rollNo;
//        this.marks = marks;
//    }
//    @Override
//    public int compareTo(Student s){
//        return this.marks-s.marks;
//    }
//}

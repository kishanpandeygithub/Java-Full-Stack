package ComparableInterface;

import java.util.*;

public class ComparableInterfaceIntro {
    public static void main(String[] args) {
//        List<Student> list = new ArrayList<>();
//        list.add(new Student("Kishan", 95));
//        list.add(new Student("ZAditiya", 90));
//        list.add(new Student("Rohit", 56));
//        list.add(new Student("Rajesh", 90));
//
//        Collections.sort(list);
//        for (Student s : list) {
//            System.out.println(s.name + " " + s.marks);
//        }
//        List<Integer> list2 =new ArrayList<>();
//        list2.add(12);
//        list2.add(15);
//        list2.add(11);
//        list2.add(13);
//        Collections.sort(list2);
//        System.out.println(list2);\


        //
    }
}

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
//        return  other.marks-this.marks  ;
        if (this.marks != other.marks)
            return this.marks - other.marks;
        return this.name.compareTo(other.name);
    }
}

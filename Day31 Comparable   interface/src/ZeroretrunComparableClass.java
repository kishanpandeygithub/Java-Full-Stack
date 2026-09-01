import java.util.Collection;
import java.util.TreeSet;

public class ZeroretrunComparableClass {
    public static void main(String[] args) {
        Student s1 = new Student("Kishan", 89);
        Student s2 = new Student("Aditya", 89);
        TreeSet<Student> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());
    }
}

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    //    @Override
//    public int compareTo(Student other) {
//        return  this.marks-other.marks  ;
//    }
    @Override
    public int compareTo(Student other) {
//        return  other.marks-this.marks  ;
        if (this.marks != other.marks)
            return this.marks - other.marks;
        return this.name.compareTo(other.name);
    }
}
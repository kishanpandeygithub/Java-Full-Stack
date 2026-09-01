import java.util.*;

public class ObjectClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.name = "Kishan";
        s1.age = 21;
        Student s2 = new Student();
        s2.name = "Kishan";
        s2.age = 21;
//        Student s3 = null;
//        System.out.println(s1.toString());
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode() == s2.hashCode());
//        System.out.println(s1.getClass().getName());
//        //instance of object work like
//        System.out.println(s1 instanceof Student);
        Student s3 = (Student) s1.clone();
        System.out.println(s3.name+" "+s3.age);
    }
}

//instance of operator
//if an object is the instance if the class of any of it's subclass


class Student extends Object implements Cloneable {
    String name;
    int age;

    @Override
    public String toString() {
        return (name + " " + age);
    }

    public boolean equals(Object obj) {
        //if this is not checked it throw the nullPointerException
        if (obj == null) {
            return false;
        }
        //if we do not check it it throw the class cast exception
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Student s = (Student) obj;
        return (this.name == s.name) && (this.age == s.age);
    }

    public int hashCode() {

//        int result = 17;
//        result = result* 31+age;
//        result = result*31+((name==null)?0:name.hashCode());
//        return result;
        return Objects.hash(name, age);

    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
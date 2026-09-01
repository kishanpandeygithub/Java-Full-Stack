package BasicOOps;

public class ClassFile {
    public static void main(String[] args) {
        Student s = new Student("Kishan", 12, 23, "Kit");
        System.out.println(s.age);
        System.out.println(s.getRollNumeber());
        Student s2 = new Student("Raj", 23);
        System.out.println(s2.getAge());
    }
}

class Student {
    String name;
    int age;
    int rollNumeber;
    String college;

    //consturctor
//    the constructor is used to initilize the instace of the class
    //constructor overloading in the java
    //creating the multiple constructor but the name of the constructor are same;
    Student(String name) {
        this(name , 18);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, int rollNumeber) {
        this.name = name;
        this.age = age;
        this.rollNumeber = rollNumeber;
    }

    Student(String name, int age, int rollNumeber, String college) {
        //this keyword is used to access the instace of the class
        this.name = name;
        this.age = age;
        this.rollNumeber = rollNumeber;
        this.college = college;
    }

    //to represent the behaviour in the oops we have the method in the java
    int getRollNumeber() {
        return rollNumeber;
    }

    int getAge() {
        return age;
    }
}

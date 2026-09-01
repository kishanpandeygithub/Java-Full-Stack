package Lambda;

import java.util.function.*;

public class PredicateCompositionRealExample {
    public static void main(String[] args){
        /*
        let for the eligibility we have check the condition
        passed ---> marks>=40;
        adult ---> age>=10;
        */

        Predicate<Student> passed= s->s.marks>=40;
        Predicate<Student> isAdult = s->s.age>=18;

        Predicate<Student> isEligible = passed.and(isAdult);

        System.out.println(isEligible.test(new Student(60 , 19)));

    }
}
class Student{
    int marks;
    int age;
    public Student(int marks , int age){
        this.age = age;
        this.marks = marks;
    }
}

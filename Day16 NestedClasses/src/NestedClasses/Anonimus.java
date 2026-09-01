package NestedClasses;

public class Anonimus {
    public static void main(String[] args){
        person p1 =new person();
        p1.introduce();
        // if we have to do a work which we have to do one time
        person p2 = new person(){
            @Override
            void introduce() {
                System.out.println("Hai i am the guste");
                greet();
            }
            void greet(){
                System.out.println("Hello");
            }
        };
        p2.introduce();
        //we can not call the greet because it is not defind in
        //the person
        //and we can not have the constructor in the anonimas class
        //because it has no name to make the constructor 
    }
}
class person{
    void introduce(){
        System.out.println("Hai I am a person");
    }
}

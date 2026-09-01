package ExceptionHierarchy;

public class CostumException {
    public static void main(String [] args){
        try {
            chaeckEligibility(-1);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
            System.out.println("Enterd Age was "+ e.getAge());
        }
    }
    private static void chaeckEligibility(int age) throws InvalidAgeException{

            if(age<0){
                throw new InvalidAgeException("Age Can not be negative" ,age);
            }
            if (age>18){
                System.out.println("You are eligible to vote");
            }

    }
}
class InvalidAgeException extends RuntimeException{
    private int age;
    public InvalidAgeException(String message ,int age){
        super(message);
        this.age =age;
    }

    public int getAge(){
        return this.age;
    }
}
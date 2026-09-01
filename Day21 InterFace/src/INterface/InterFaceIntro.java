package INterface;

public class InterFaceIntro {
    public static void main(String[] args){
//        Car c =new BlackThar();
//        c.Drive();
        Payment p= new CreditCard();
        p.pay();
    }
}
interface Car{
    void Drive();
}
abstract class Thar implements Car{

    abstract  public void Drive();
}
class BlackThar extends Thar{
    @Override
    public void Drive(){
        System.out.println("Thar is Driving");
    }
}

//polymorphism
interface Payment{
    void pay();
}
class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying via credit card");
    }
}class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying via Debit card");
    }
}
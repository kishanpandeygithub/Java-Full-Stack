package Encapsulation;

//class Animal{
//    int noOfLegs;
//    String type;
//    void eat(){
//
//    }
//    void run(){
//
//    }
//}

public class Encaptual {
    public static void main(String [] args){
        //Encapsulation :means both the data and the behaviour are the encapsulate together
        //with in the object we should not provide the unristricted access to the user
        //to encapustate it ue use the access modifiers
        /*
        public:it variable can be accessed form anywhere of the class
        private:if the access modifier is the private the variable can be accessible only with int he class only
        protacted: anyone can access the protacted variable from class and the inherted class
        default: anyone can access the variabel outside the class but onlu with in the same package
         */
        BankAccount b1  =  new BankAccount();
        b1.deposit(500);
        b1.withDraw(300);
        System.out.println(b1.getBankBalance());
    }
}
class  BankAccount{
    private double bankBalance;
    public void deposit(int amount){
        bankBalance+= amount;
    }
    public void withDraw(int amount){
        bankBalance-= amount;
    }
    public double getBankBalance(){
        return bankBalance;
    }
}
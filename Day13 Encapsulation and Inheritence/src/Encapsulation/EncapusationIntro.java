package Encapsulation;

public class EncapusationIntro {
    public static void main(String[] args) {
        BankAccunt ba = new BankAccunt();
        ba.deposit(2000);
        ba.withdraw(100);
        System.out.println(ba.getBalance());
    }
}

class BankAccunt {
    private double balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    Student(String name, int rollNumber, int age, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;

    }
    //getter and the setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }

}


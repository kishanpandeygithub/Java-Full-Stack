package NestedClasses;

public class NestedClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun();
    }
}

class Outer {
    static int x = 4;
    int y = 10;

    static class Inner {
        Outer outer;

        Inner(Outer outer) {
            this.outer = outer;
        }

        void fun() {
            System.out.println("Hello World");
            //to use the non static variable of the outer class we have to pass the refrence of the outer class to the
            // inner class
            System.out.println(outer.y);
        }
    }
}

class BancAccount {
    private static class IntrestCalculator {
        static double calculateYearly(double principal, double rate) {
            return principal * rate;
        }
    }

    public double computerInterest(double principal) {
        return IntrestCalculator.calculateYearly(principal, 0.09);
    }
}
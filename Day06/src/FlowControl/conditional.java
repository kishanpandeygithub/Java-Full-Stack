package FlowControl;

public class conditional {
    public static void main(String[] args){
        //    selection statement in the java work on the conditional statement
        //normal if
        // we have the normal if when we have to check the simple condition in the statement
        int a =10;
        if(a==10){
            System.out.println("A is 10");
        }
        //if with the else
        int age =109;
        if(age>=18){
            System.out.println("Able to vote");
        }else{
            System.out.println("can not vote");
        }

        //if else ledder
        int marks = 99;
        if(marks>90){
            System.out.println("A+ grade");
        }else if(marks>70){
            System.out.println("A grade");
        }else if(marks>50){
            System.out.println("B grade");
        }else{
            System.out.println("C grade");
        }

        //nested if
        if(age>18){
            if(age>21){
                System.out.println("You can vote ,and marry");
            }else{
                System.out.println("You can only vote");
            }
        }else{
            System.out.println("You cant vote and merry");
        }


        //switch statement

        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}

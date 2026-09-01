public class EnumIntro {
    public static void main(String [] args){
        int status = PaymentStatus.SUCCESS;
        System.out.println(status);
        if(status==1){
            System.out.println("Success");
        }
    }
}
//payment status
//success , failed , pending
//problem:
/*
1: type sefty
2:poor readability
3:
*/

class PaymentStatus{
    public static final  int SUCCESS =1;
    public static final  int FAILED =2;
    public static final  int PENDING =3;

}
class Role{
    public static final int USER =1;
    public static final int ADMIN =2;
    public static final int MANAGER =3;
}
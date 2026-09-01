public class Enum {
    public static void main(String[] args) {
//        int status =PaymentStatus2.SUCCESS;
        PaymentStatusId statusId = PaymentStatusId.SUCCESS;
        System.out.println(statusId.name());
    }

}
enum PaymentStatusId{
    SUCCESS,
    FAILED,
    PENDING
}
class PaymentStatus2{
    public static final  int SUCCESS =1;
    public static final  int FAILED =2;
    public static final  int PENDING =3;

}
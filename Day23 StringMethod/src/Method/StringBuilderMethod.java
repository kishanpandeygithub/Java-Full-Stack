package Method;

public class StringBuilderMethod {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Kishan");
        sb.append("Pandey");
        sb.append("lllll");
//        System.out.println(sb.capacity());
//        System.out.println(sb);
//        sb.insert(2 , "P");
//        sb.delete(2 ,3);///delete from start to end
//        sb.deleteCharAt(2);

//        sb.replace(1 ,3 , "lap");
//        sb.reverse() ;

//        sb.setCharAt(3 ,'w');
//        sb.trimToSize();
        
        System.out.println(sb.length());
        System.out.println(sb.capacity() );
    }
}

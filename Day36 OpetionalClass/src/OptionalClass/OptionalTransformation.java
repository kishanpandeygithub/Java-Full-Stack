package OptionalClass;

import java.util.Optional;
public class OptionalTransformation {
    public static void main(String [] args){
//        User user=  getUser();
        //this is the treditionl and the berbose method
//        if(user!= null){
//            Address a = user.address;
//            if(a!=null){
//                String city = a.city;
//                if(city!=null){
//                    System.out.println(city);
//                }
//            }
//        }
        Optional<User> user = getUser();
//        user.map(x->x.address)
//                .map(y->y.city)
//                .ifPresent(z->System.out.println(z));
        //flatmap
////        if we do not use the faltmap then it just return
//        Optional<Optional<Address>> address = user.map(x->x.address);
//        //but when we use the faltmap then it return the
//        //it flatent he multiple optional data
//        Optional<Address> address1 = user.flatMap(x->x.address);
//        user.flatMap(x->x.address)
//                .map(y->y.city)
//                .ifPresent(System.out::println);

//         Optional<String> name = Optional.ofNullable("Kishan");
//         Optional<String> result = name.filter(x->x.length()>10);
//         System.out.println(result.orElse("Empty"));\

        Optional<String > name = Optional.ofNullable("Kishan");
        name.map(x->x.length())
                .filter(len->len>5)
                .ifPresent(System.out::println);
    }
    //it say that the user and the herarchy can be the null or not
    private static Optional<User> getUser(){
        Address a  = new Address();
        a.city = "Delhi";
        User u = new User();
        u.address = Optional.ofNullable(a);
        return Optional.ofNullable(u);
    }
}
class User{
//    public Address address;
    public Optional<Address> address;
}
class Address{
    public String city;
}

//.map()  ->>> function(T->R)
//.map() in the optional if the vlaue present then apply the map
//and return the optional so it is like the mini stream
//else if the value is not presnet then remain empty
//stream has the multile value (1 2 ,3 ,4 ,5 , 6, 7,4)
//but the optional class has the one value [user]


//flatMap() -->//it flatent he multiple optional data

//.filter() it check for the value if the value is not presnt then
//keep the value otherwise it will not take the value
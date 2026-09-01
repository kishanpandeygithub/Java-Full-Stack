package OptionalClass;

import java.util.Optional;

public class OptionalIntro {
    public static void main(String[] args){
        Optional<String> name = getName();
//        System.out.println(name.get());
        //it is safe but not so good
//        if(name.isPresent()){
//            System.out.println(name.get());
//        }
//        name.ifPresent(System.out::println);
//        System.out.println(name.orElse("Unknown"));

        //it take the supplier object
//        System.out.println(name.orElseGet(()->"UNknown"));

//        System.out.println(name.orElseThrow());

        //ifPresentOrElse return the vlaue if the value is present and
        // if the value is not present then it returnt he defalult value

        name.ifPresentOrElse(System.out::println ,()->System.out.println("Unknown value"));
    }
    public static Optional<String> getName(){
        return Optional.ofNullable(null);
//        return Optional.ofNullable("Kishan");
    }
}

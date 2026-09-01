package CollectionFrameWork;

import java.util.*;
import java.lang.Iterable;

public class iteratorCreation {
    public static void main(String[] args) {
        String[] names = {"kishan", "Aajad", "rohit", "Aditiya"};
        NameContainer container = new NameContainer(names);
//        to prevent this overhead java provide this enhanced for loop
//        Iterator<String> it = container.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        //Enhanced for loop is
        for(String s: container){
            System.out.println(s);
        }
    }
}

class NameContainer implements Iterable<String> {  // Fully qualified name
    private String[] names;
    private int size;

    NameContainer(String[] names) {
        this.names = names;
        this.size = this.names.length;
    }

    @Override
    public java.util.Iterator<String> iterator() {  // Also use fully qualified for Iterator
        return new Iterator<String>() {
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < size;
            }

            @Override
            public String next() {
                return names[pos++];
            }
        };
    }
//this class is not going to create again and again so we can use the anonoimas class to implemet it
//    private class NameContainerIterator implements java.util.Iterator<String> {
//        private int pos = 0;
//
//        @Override
//        public boolean hasNext(){
//            return pos < size;
//        }
//
//        @Override
//        public String next(){
//            return names[pos++];
//        }
//    }
}
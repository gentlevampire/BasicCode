package HeiMa;

import java.util.ArrayList;

public class arraylist  {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("hello");
        a.add(" world");
        a.add("~~~");
        System.out.println(a);
//        a.remove("hello");
//        System.out.println(a.remove("hello"));
//        System.out.println(a.remove(1));
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
    }
}

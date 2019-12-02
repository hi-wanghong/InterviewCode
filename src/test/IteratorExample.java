package test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        System.out.println("Before iterate : " + a);
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            String t = it.next();
            System.out.println(t);
            if ("bbb".equals(t)) {
                it.remove();
            }
        }
        System.out.println("After iterate : " + a);
    }
}

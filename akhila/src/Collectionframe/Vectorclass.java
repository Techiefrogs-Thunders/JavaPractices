

import java.util.Vector;

public class Vectorclass {
    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");
        System.out.println(v);
        v.addElement("e");
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());
        System.out.println(v.contains("a"));
        Vector<String> v1=new Vector<String>();
        //v1=v.clone();
        System.out.println(v.clone());
        v.removeElement("e");
        System.out.println(v);
        v.clear();
        System.out.println(v);
    }
}

import java.util.*;
public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<String> set1=new TreeSet<String>();
        set1.add("aa");
        set1.add("bb");
        set1.add("cc");
        set1.add("dd");
        System.out.println(set1);
        TreeSet<String> set2=new TreeSet<String>();
        set2.add("ak");
        set2.add("bk");
        set2.add("ck");
        set2.add("dk");
        System.out.println(set2);
        //set1.addAll(set2);
        //System.out.println(set1);
        //String str=set1.ceiling("bd");
        //System.out.println(str);
        //Comparator c=set1.comparator();
        //System.out.println(c);
        //Iterator<String> i=set1.descendingIterator();
        //while(i.hasNext()){
        //    System.out.println(i.next());
        //}
        //NavigableSet<String> ns=set1.descendingSet();
        //Iterator<String> n=ns.iterator();
        //while(n.hasNext()){
        //    System.out.println(n.next());
        //}
        //System.out.println(set1.floor("al"));
        System.out.println(set1.pollFirst());
        System.out.println(set2.pollLast());
        System.out.println(set1.headSet("bb",true));
        System.out.println(set1.subSet("aa",false,"cc",true));
        System.out.println(set1.tailSet("cc",false));
        
    }
}

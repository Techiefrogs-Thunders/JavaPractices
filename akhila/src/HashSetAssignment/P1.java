package HashSetAssignment;
	import java.util.*;
	public class P1 {
	    public static void main(String[] args) {
	        HashSet<Integer> hs=new HashSet<Integer>();
	        hs.add(1);
	        hs.add(2);
	        hs.add(3);
	        hs.add(4);
	        System.out.println(hs);
            HashSet<Integer> hs1=new HashSet<Integer>();
            hs1=(HashSet)hs.clone();
            System.out.println(hs1);           
            //Iterator i=hs.iterator();
            //while(i.hasNext()){
            //    System.out.println(i.next());
            //}
            //System.out.println(hs.size());
            hs.clear();
            System.out.println(hs);
            //System.out.println(hs.isEmpty());
	    }
	}

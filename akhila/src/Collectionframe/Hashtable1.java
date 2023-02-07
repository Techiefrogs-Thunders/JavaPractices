import java.util.*;
public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm=new Hashtable<>();
        hm.put(1,"jdhvwq");
        hm.put(2,"jhqwdv");
        hm.put(3,"jhdvkj3w");
        //hm.putIfAbsent(4,"gwvd");
        //System.out.println(hm);
        //hm.remove(2);
        //System.out.println(hm.getOrDefault(1,"Not Found"));
        //System.out.println(hm.getOrDefault(5, "Not Found"));
        System.out.println(hm);
    }
}
//put(): to insert the value
//getOrDefault(1,"Not Found") : if the key is not there it prints Not found
//putIfAbsent(1,"ljhewvbs") : if absent insert it into the list

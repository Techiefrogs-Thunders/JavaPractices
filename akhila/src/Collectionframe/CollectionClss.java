import java.util.*;
public class CollectionClss {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("hjqwvd");
        l.add("akhila");
        l.add("teja");
        System.out.println(l);
        String[] str={"zdg","wkdj"};
        Collections.addAll(l,str);
        System.out.println(l);
        System.out.println(Collections.max(l));
        System.out.println(Collections.min(l));
    }
}

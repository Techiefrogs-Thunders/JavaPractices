import java.util.*;
public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
        tm.put(1,"akhila");
        tm.put(3,"wfdjwv");
        tm.put(2,"gwg");
        tm.put(4,"efef");
        System.out.println(tm);
        for(Map.Entry m:tm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //tm.remove(1);
        //System.out.println(tm);
        System.out.println(tm.descendingMap());
        System.out.println(tm.headMap(3,true));
        System.out.println(tm.tailMap(3,true));
        System.out.println(tm.subMap(1,false,4,true));
    }
}
// TreeMap : red-black tree based implementation
//provides an efficient means of storing key-value pairs in sorted order
//contains values based on the key
//implements the NavigableMap interface and extends AbstrctMap class
//contains only unique elements
//cannot have a null key but can have multiple null values.
//non-synchronized
//maintains ascending order
// If we have given 2 same key values , the second value will be considered

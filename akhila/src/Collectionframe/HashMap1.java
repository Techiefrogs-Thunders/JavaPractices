import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"akhila");
        hm.put(2,"jwhdjwh");
        hm.put(3,"hjdjhvjh");
        hm.put(4,"dvjvdjhd");
        //hm.remove(1,"akhila");
        System.out.println(hm);
        //hm.remove(1);
        //System.out.println(hm);
        //hm.putIfAbsent(5,"akhila");
        //System.out.println(hm);
        //System.out.println(hm.clone());
        //hm.clear();
        //System.out.println(hm);
        //System.out.println(hm.isEmpty());
        //System.out.println(hm.entrySet());
        //System.out.println(hm.keySet());
        //HashMap<Integer,String> hm1=new HashMap<>();
        //hm1.putAll(hm);
        //System.out.println(hm1);
    }
}
//HashMap: implements map interface which allows us to store key and value pair
//keys should be unique
//found in util package
//easy to perform operations using the key index.
//if u try to insert the duplicate key,it will replace the element of the correspondin key.
//contains values based on the key
//contains only unique keys
//may have one null key and multiple null values.
//non-synchronzed
//maintains no-order
//default capacity is 16
//load factor is 0.75
//put(): same meaning as add()
//clear(): clears the map
//entrySet(): create a set out of the same elements contained in the hash map.
//keySet(): is used to create a setout of the elements contained in the hashmap.
//returns a set having the keys of the hashmap.
//putAll(): used for the copy operation. copies all of the elements
//putIfAbsent(k,v) : adds the specific key if absent
//remove(k): removes the element
//remove(k,v) : removes the specified values with the associated keys from the map.


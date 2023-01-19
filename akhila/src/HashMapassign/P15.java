package HashMapassign;

import java.util.Vector;

public class P15 {
    static void find(Vector<String> list1, Vector<String> list2)
{
    Vector<String> res = new Vector<>(); 
    int max_possible_sum = list1.size() + list2.size() - 2;
 
   
    for (int sum = 0; sum <= max_possible_sum ; sum++)
    {
        
        for (int i = 0; i <= sum; i++)
         
            if (i < list1.size() &&
                (sum - i) < list2.size() &&
                list1.get(i) == list2.get(sum - i))
                res.add(list1.get(i));        
 
        if (res.size() > 0)
            break;
    }
 
    // print the resultant list
    for (int i = 0; i < res.size(); i++)
        System.out.print(res.get(i)+" ");
}
public static void main(String[] args)
{
    Vector<String> list1 = new Vector<>();
    list1.add("akhilakakarla");
    list1.add("jyothi");
    list1.add("techiefrogs");
    list1.add("signitives");
    Vector<String> list2= new Vector<>();
    list2.add("hackerrank");
    list2.add("Akhila");
    list2.add("akhilakakarla");
 
    find(list1, list2);
 
}
}

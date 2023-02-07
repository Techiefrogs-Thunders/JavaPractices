package Enums;

import abstraction.Main1;
import java.util.*;
public class EnumMap1 {
    enum days{
        MON,TUE,WED,THURS,FRI,SAT,SUN
    }
    public static void main(String[] args) {
        EnumMap<days,String> map=new EnumMap<days,String>(days.class);
        map.put(days.MON, "1");
        map.put(days.TUE,"2");
        map.put(days.WED,"3");
        map.put(days.SUN,"0");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

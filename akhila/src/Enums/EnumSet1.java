package Enums;

import java.util.EnumSet;
import java.util.*;
public class EnumSet1 {
    enum Days{SUN,MON,TUES,WED,THURS,FRI,SAT, THURSDAY}
    enum months{JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}
    public static void main(String[] args) {
        Set<Days> ed=EnumSet.allOf(Days.class);
        ed.add(Days.THURSDAY);
        Iterator i1=ed.iterator();
        while(i1.hasNext()){
            System.out.print(i1.next()+" , ");
        }
        System.out.println();
        System.out.println("==========");
        Set<months> em=EnumSet.allOf(months.class);
        Iterator i2=em.iterator();
        while(i2.hasNext()){
            System.out.print(i2.next()+" , ");
        }
    }
}

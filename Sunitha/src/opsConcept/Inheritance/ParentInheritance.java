package opsConcept.Inheritance;

import java.util.Scanner;

public class ParentInheritance {
    private static void main(String[] args) {
        System.out.println("parent calss expression");
        ParentInheritance pi=new ParentInheritance();
      /*   ChildInharitance in=new ChildInharitance();
        long bonus=1200, perexpenses=1500;
        Scanner sc=new Scanner(System.in);
            System.out.println("enter details");
        String name=sc.next();
        String designation=sc.next();
        String branch=sc.next();  //      sc.hasNext();
        String location=sc.nextLine();          sc.hasNext();
        int salary=in.emSalary(23656878);
        System.out.println("-------------------------------------------------------------");
            System.out.println("name:  "+name);
            System.out.println("designation:  "+designation);
            System.out.println(in.emBand('A'));
            System.out.println("branch:  "+branch);
            System.out.println("Location:  "+ location);
            System.out.println("Bonus : "+bonus +"   "+"Personal Expenses: "+ perexpenses);
           // System.out.println(in.emCode(23));
            System.out.println("Salary :  "+ salary); */
   //-------------------------------------------------------------------------------------------------------
   SubInheritance sbi=new SubInheritance(0);
        long bonus=1200, perexpenses=1500;
        Scanner sc=new Scanner(System.in);
            System.out.println("enter details");
        String name=sc.next();
        String designation=sc.next();
        String branch=sc.next();  //      sc.hasNext();
        String location=sc.nextLine();          sc.hasNext();
        int salary=sbi.emSalary(23656878);
        double hike=sbi.emHike(22.33);
        float hikePer=sbi.emHikePer(10.2f);
        System.out.println("-------------------------------------------------------------");
            System.out.println("name:  "+name);
            System.out.println("designation:  "+designation);
            System.out.println(sbi.emBand('A'));
            System.out.println("branch:  "+branch);
            System.out.println("Location:  "+ location);
            System.out.println("Bonus : "+bonus +"   "+"Personal Expenses: "+ perexpenses);
           // System.out.println(in.emCode(23));
            System.out.println("Salary :  "+ salary);
            System.out.println("Hike : "+ hike);
            System.out.println("Hike prccentage: "+ hikePer);
            System.out.println(sbi.emBackCheck(true));
           pi.name();
    }
    private void name() {
       System.out.println("parent method"); 

    }
}

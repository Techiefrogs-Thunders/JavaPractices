package opsConcept.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        InnerEncapsulation enc=new InnerEncapsulation();
        enc.employe();
        enc.employe("sunitha");
        enc.salaryPrint(76543);
        enc.floatValue(22.6f);
    }
}
class InnerEncapsulation {
public String name, designation, branch, location;
private int salary;
public boolean bcheckpassed;
private char band;
private byte code;
private double hike;
private long bonus, perexpenses;
private float hperncentage;
public short devices;
InnerEncapsulation(){
    System.out.println("constructor");
}
public void employe(){
System.out.println("method starts");
}

public String employe(String nameE){
    name=nameE;
    System.out.println(name);
    return nameE;
 }
public int salaryPrint(int salaryE) {
     salary=salaryE;
     System.err.println(salary);
    return salaryE;
    
}
public float floatValue(float hperncentageE) {
    hperncentage=hperncentageE;
    System.out.println(hperncentage);
    return hperncentageE;
    
}
}
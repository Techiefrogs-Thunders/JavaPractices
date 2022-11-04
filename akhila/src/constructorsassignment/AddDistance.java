package constructorsassignment;
import java.util.*;
class Distance{
int feet , inches;
void getdistance() {
Scanner in = new Scanner(System.in);
System.out.print("Enter feet> ");
feet = in.nextInt();
System.out.print("Enter inches> ");
inches = in.nextInt();
in.close();
}
void addDistance(Distance d1, Distance d2){
double sumofFeet = d1.feet + d2.feet;
double sumofInch = d1.inches + d2.inches;
System.out.println(sumofFeet + " " + sumofInch);
}
}
public class AddDistance{
public static void main (String[] args){
Distance d1 = new Distance();
Distance d2 = new Distance();
d1.getdistance(); 
d2.getdistance(); 
d1.addDistance(d1,d2); 
} }

package interfaceassignment;
import package1.*;
import package2.*;
public class Seven extends Ex6Base {

Ex6Interface getBaseInner() {
// Error: Ex6BaseInner has protected access:

// return this.new Ex6BaseInner();
// So, to create protected class use public method:
return (Ex6Interface) this.getEx6BaseInner();


}
public static void main(String[] args) {
Seven ex = new Seven();

System.out.println(ex.getBaseInner().say());
}
}
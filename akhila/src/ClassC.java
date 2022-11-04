public class ClassC {
   void meth1()
   {
    System.out.println("meth1() called");
   }
   public static void main(String[] args) {
    ClassC cobj1=new ClassC();
    ClassC cobj2=new ClassC();
    int cobj1Hashcode=cobj1.hashCode();
    int cobj2Hashcode=cobj2.hashCode();
    System.out.println("cobj1 Hashcode is :"+cobj1Hashcode);
    System.out.println("cobj2 Hashcode is :"+cobj2Hashcode);
    System.out.println(cobj1.equals(cobj2));
    System.out.println("getClass(): "+cobj1.getClass());
    System.out.println("getClass(): "+cobj2.getClass());
    System.out.println("toString(): "+cobj1.toString());
   }
}

public class Hierarchal_inheritanceB extends Hierarchal_inheritanceA{
    public void meth2()
    {
    System.out.println("calling Hierarchal_InheritanceB");	
    
    }
        public static void main(String[] args) {2
    
            Hierarchal_inheritanceA aobj=new Hierarchal_inheritanceA();
            aobj.meth1();//valid
            //aobj.meth2();//invalid
            System.out.println("_________");
            Hierarchal_inheritanceA aobj2=new Hierarchal_inheritanceB();
            aobj2.meth1();//valid
            //aobj2.meth2();//invalid
            System.out.println("_________");
            Hierarchal_inheritanceB bobj=new Hierarchal_inheritanceB();
            bobj.meth1();//valid parent class method
            bobj.meth2();//valid child class method 
            System.out.println("_________");
            //Hierarchal_InheritanceB cobj=new Hierarchal_InheritanceA();//invalid
            
        }
    
    }
package opsConcept.objectsClass;
public class Objects
{
    public static void main(String[] args) 
    {
        Company iphone=new Company();
             iphone.no=1; iphone.profit=456789;
            System.out.println("No= "+iphone.no +"  "+iphone.name+"  "+ iphone.key+"  "+ iphone.profit );
            iphone.techM(); iphone.accenture(); iphone.microsoft();
            
        Company android=new Company();
            android.key='a';  android.name="position";
            System.out.println("No= "+iphone.no +"  "+iphone.name+"  "+ iphone.profit+"  "+ android.key );
            android.deloit(); android.accenture(); iphone.microsoft();
        Company windows=new Company();
            windows.name="top"; windows.key='y';
            windows.loyal=true; windows.dell();
            System.out.println("No= "+windows.key +"  "+windows.name+"  "+ iphone.key+"  "+ android.addres );
            android.deloit(); windows.dell();
            company();
    }
     public static void company(){
        System.out.println("company");
     } 
    // {
    // byte no;
    // String name;
    // short addres;
    // char key;
    // boolean loyal;
    // int profit;

     public void techM(){
         System.out.println(name+"Software requirements");
     }
     public void accenture(){
        System.out.println(key+"requirements gathering");

    }
    public void microsoft(){
      System.out.println(no+"planning");
     }
    public void deloit() {
     System.out.println(profit+"Devlopening");
        
    }
    public void dell() {
     System.out.println(addres+"testing");
    } 
   }

}

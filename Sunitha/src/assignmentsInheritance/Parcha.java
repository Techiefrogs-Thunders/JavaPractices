package assignmentsInheritance;

import java.util.jar.Attributes.Name;

public class Parcha {
    public static void main(String[] args) {
        CountedItem cc=new CountedItem(77);
        WeighedItem ww=new WeighedItem(88);
        System.out.println("Unitprice value: "+ cc.getPrice());
        System.out.println("Name of Item: "+ww.getName());
        //System.out.println(cc.setName("class"));
        //System.out.println(ww.setPrice(23.22));
    } 
}
class PurchaseItem {
    private String name;
    private double unitPrice;
    PurchaseItem(){

    }
    PurchaseItem(String name, double unitPrice){
        this.name=name;
        this.unitPrice=unitPrice;
    }
    double getPrice(){
       // this.unitPrice=unitPrice;
return unitPrice;
    }
    void setPrice( double unitprice){
        this.unitPrice=unitprice;

    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
}

class WeighedItem  extends PurchaseItem{
    private double weight;
    WeighedItem(double w){
        super("java", 10.22);
        System.out.println(w);
       // System.out.println();
    }
    double getPrice(){
      return super.getPrice()*weight;

    }
}
class CountedItem extends PurchaseItem{
    private int quality;
    CountedItem(int q){
        this.quality=q;
    }
    double getPrice(){
       // double price=getPrice()*quality;
      return super.getPrice()*quality;

 }
    

}
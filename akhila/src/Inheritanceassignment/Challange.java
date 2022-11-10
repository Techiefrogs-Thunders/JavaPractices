package Inheritanceassignment;
import java.util.Scanner;
public class Challange {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("=========Weighed Item=========");
       System.out.println("Enter Name,Unit Price,Weight:-");
       WeighedItem w=new WeighedItem();
       w.setData(sc.next(),sc.nextDouble());
       w.setweight(sc.nextDouble());
       System.out.println(" "+w.toString());
       System.out.println("========Counted Item=========");
       System.out.println("ENter Name,Unit Price,Quantity:-");
       CountedItem c=new CountedItem();
       c.setData(sc.next(),sc.nextDouble());
       c.setquantity(sc.nextInt());
       System.out.println(" "+c.toString());
       sc.close();
    }
}
class PurchaseItem{
    private String name;
    private double unitPrice;
    public PurchaseItem()
    {
        this.name="NO Item";
        this.unitPrice=0;
    }
    public PurchaseItem(String name, double unitPrice)
    {
        this.name=name;
        this.unitPrice=unitPrice;
    }
    public void getData()
    {
        System.out.println("Name: "+name);
        System.out.println("Unit price: "+unitPrice);
    }
    public void setData(String name,double unitPrice)
    {
        this.name=name;
        this.unitPrice=unitPrice;
    }
    public double getPrice()
    {
        return unitPrice;
    }
    
    public String toString()
    {
        return name+" @ "+unitPrice;
    }
}
class WeighedItem extends PurchaseItem{
    private double weight;
    public WeighedItem()
    {
    } 
    public WeighedItem(double weight)
    {
        this.weight=weight;
    }   
    public double getweight()
    {
        return weight;
    }
    public void setweight(double Weight)
    {
        this.weight=Weight;
    }
    public double getPrice()
    {
        return weight*super.getPrice();
    }
    public String toString(){
        return super.toString()+" "+weight+"kg"+getPrice()+"SR";
    }
}
class CountedItem extends PurchaseItem{
    private int quantity;
    public CountedItem()
    {
        System.out.println("This is CountedItem");
    }
    public CountedItem(int quantity){
        this.quantity=quantity;
    }
    public int getquantiity()
    {
        return quantity;
    }
    public void setquantity(int quantity)
    {
        this.quantity=quantity;
    }
    public double getPrice()
    {
        return quantity*super.getPrice();
    }
    public String toString()
    {
        return super.toString()+" "+quantity+" units "+getPrice()+"SR";
    }
}
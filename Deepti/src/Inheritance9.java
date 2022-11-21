

class PurchaseItem {

    private String name;
    private double unitPrice;

    PurchaseItem(String name,double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public double getPrice(){
        return unitPrice;
    }

    public void setPrice(double price){
        this.unitPrice = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class WeighedItem extends PurchaseItem{

    private double weight;

    WeighedItem(double weight){

        super("Rice",10);
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public double getPrice(){
        double p = super.getPrice();
        double total = p * weight;
        return total;
    }


}

class CountedItem extends PurchaseItem{

    private int quantity;

    CountedItem(int quantity){
        super("Chocolates",5);
        this.quantity = quantity;    
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public double getPrice(){

        double p = super.getPrice();
        double total = p * quantity;
        return total;
    }
}
public class Inheritance9 {
    public static void main(String[] args) {
        WeighedItem weight = new WeighedItem(20);
        CountedItem count = new CountedItem(10);

        System.out.println("The Price of "+ weight.getWeight() +" kg "+ weight.getName() + " is " +" $"+weight.getPrice());

        System.out.println("The Price Of "+ count.getQuantity() + " " +count.getName() + " is " +" $"+count.getPrice());
    }

    
}

package Oops_concepts;
//Java Program to demonstrate the use of the parameterized constructor.  
class ConstructorWithArguments{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    ConstructorWithArguments(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    ConstructorWithArguments s1 = new ConstructorWithArguments(111,"Prashanth");  
    ConstructorWithArguments s2 = new ConstructorWithArguments(222,"Reddy");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  
package Oops_concepts;

//A Java class to test the encapsulated class Account.  
public class EncapsulationMain {  
    public static void main(String[] args) {  
        //creating instance of Account class  
        Account acc=new Account();  
        //setting values through setter methods  
        acc.setAcc_no(7560504000L);  
        acc.setName("Prashanth");  
        acc.setEmail("prashanthreddy@gmail.com");  
        acc.setAmount(100000f);  
        //getting values through getter methods  
        System.out.println(acc.getAcc_no());  
        System.out.println(acc.getName());  
        System.out.println(acc.getEmail());  
        System.out.println(acc.getAmount());  
    }  
    }  
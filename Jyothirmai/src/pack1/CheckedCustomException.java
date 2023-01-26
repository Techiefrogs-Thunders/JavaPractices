package pack1;

import java.sql.SQLException;

public class CheckedCustomException extends Exception{

    CheckedCustomException(String message){
        super(message);
    }
}

class DriverClass{
    public static void main(String[] args) {
        int age = 18;
        try{
            validate(age);
        }catch(CheckedCustomException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
        System.out.println("After validate method");
        
    }

    static void validate(int age) throws CheckedCustomException, SQLException{
            if(age>18){
                System.out.println("eligible");
            }else{
                throw new CheckedCustomException("not eligible");
            } 
    }
}

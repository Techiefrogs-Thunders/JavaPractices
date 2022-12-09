package Exceptions;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

public class Custom2 {
    static void validate(int age) throws InvalidAgeException{
        if(age<18)
        {
            ArithmeticException ae = new ArithmeticException("Age not Valid");
            throw ae;
        }
        else{
            System.out.println("Right to Vote");
        }
    }
    
    public static void main(String[] args)
    {
        int age = 11;
        try{
            validate(age);
        }catch(InvalidAgeException e)
        {
            System.out.println("Invalid age Exception details :" + e.getMessage());
        }
    }
}
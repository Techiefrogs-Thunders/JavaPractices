package pack1;

public class MyCustomException {
    public static void main(String[] args) {
        int age = 18;
        try {
            validate(age);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void validate(int age) throws InvalidAgeException{
        try{
        if(age<18){
            throw new InvalidAgeException("age not matched with my criteria");
        }else{
            System.out.println("able to donate");
        }
    }catch(InvalidAgeException i){
        System.out.println(i);
    }
    }
}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
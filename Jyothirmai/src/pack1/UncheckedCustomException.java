package pack1;

public class UncheckedCustomException extends RuntimeException{
    UncheckedCustomException(String message){
        super(message);
    }
}

class NewDriver{
    public static void main(String[] args) {
        int weight = 49;
        try{
            validate(weight);
        }catch(UncheckedCustomException u){
            System.out.println(u);
        }
        System.out.println("After validate method");
    }

    static void validate(int weight){
        
            if(weight >=50){
                System.out.println("eligible to donate blood");
            }else{
                UncheckedCustomException un = new UncheckedCustomException("under weight");
                throw un;
            }
    }
}

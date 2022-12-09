package Exceptions;

public class Custom1{
    public static void main(String[] args) throws NotElgible1Excepton{
        validateAge(22);
    }

    private static void validateAge(int i) {
    }

    public static void  Age(int age) throws NotElgible1Excepton{
        if (age<18){
        try{
        {
            throw new NotElgible1Excepton("You are NOT ELGIBLE");
        }
        }catch(NotElgible1Excepton n){
        System.out.println("You are not Elgible");
        }
}
else {
    System.out.println("Elgible");
}
}

}

class NotElgible1Excepton extends Exception{
    
    public NotElgible1Excepton(String string) {
    }

    public void NotElgibleExcepton(String message){
        //super(message);
    }
}

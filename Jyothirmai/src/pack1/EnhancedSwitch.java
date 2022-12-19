package pack1;

public class EnhancedSwitch {
    public static void main(String[] args) {
        int i = 10;
        int k = switch(i){
           
            case 5, 15, 10:
               System.out.println("value is given num");
               yield 5;
            case 20:
               System.out.println("value is 20");
               yield 20;
            default:
               System.out.println("in default");
               yield 0;
        };

        switch(i){
            case 10 -> System.out.println("In 10");
            case 20 -> System.out.println("In 20");
            default -> System.out.println("In default");
        }
        System.out.println("My k value is "+k);
    }
}

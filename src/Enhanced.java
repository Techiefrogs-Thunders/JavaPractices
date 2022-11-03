public class Enhanced {
    public static void main(String[] args) {
        int x = 5;
        int y = 20;
        int i = switch (x | y) {
            case 5, 10, 15 : 
                System.out.println("Given variable");
                yield 5;
            case 20 :
                System.out.println("Value is 20");
                yield 20;
            case 25 :
                System.out.println("value is 25");
                yield 25;
            default :
                System.out.println("Nothing");
                yield 0;
        };
        System.out.println("the i value is "+ i);
    }
}

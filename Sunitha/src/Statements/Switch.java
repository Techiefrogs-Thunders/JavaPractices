package Statements;

public class Switch {
    public static void main(String[] args) {
        int eye=10;
        String sw="milk";
       char c='b'; 
        switch (c) {
            case 'a':System.out.println("monday");break;
            case 'E': System.out.println("tuesday"); break;
            case 'O': System.out.println("wednesday");break;
            case 'I': System.out.println("sunday"); break;
            case 'U':System.out.println("checking");break;
            case 'b': System.out.println("number"); //break;
            case 'f':System.out.println("awsedrft"); //break;
            case 8: sw="number"; break;
            // case "almond": eye=23;
            // case "milk": eye=24;
            // System.out.println(eye);
            // case "healty": eye=34; System.out.println(eye);
            // break;
            default: System.out.println("invalid week");
                break;
        
        //FALL THROUGH BEHAVIOUR(if we dont give break in switch)
        // switch (b) {
        
                
        //         break;
        
        //     default:
        //         break;
        // }
        
            }
    }
}

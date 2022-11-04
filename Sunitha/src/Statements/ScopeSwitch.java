package Statements;

public class ScopeSwitch {
    public static void main(String[] args) {
        String text = switch (itemCode) {
            case 001 : 
            yield "It's a laptop!";
            case 002 :
                yield "It's a desktop!";        
            case 003 :
                yield "It's a mobile phone!";
            default :
            //    throw new IllegalArgumentException(itemCode + "is an unknown device!");
        }
    }
}

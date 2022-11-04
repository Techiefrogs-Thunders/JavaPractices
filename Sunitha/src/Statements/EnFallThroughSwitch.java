package Statements;

public class EnFallThroughSwitch {
public static void main(String[] args) {
    int name=50;
    switch (name) { //in fallthrough no need to use break it automatically check condition and exit
        case 1-> System.out.println("name 1");
       // case 2,3,4,7,9-> System.out.println("beween some no's");
        //case 15, 19, 10,20, 30-> System.out.println("actual no");
        //case 11, 12, 13, 14-> System.out.println("additional no +1");
        //case 50->30;
        default-> System.out.println("default invalid");
    }
}    
}

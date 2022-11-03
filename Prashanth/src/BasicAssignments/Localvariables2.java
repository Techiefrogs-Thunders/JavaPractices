package BasicAssignments;
public class Localvariables2 {
    public static void main(String[] args) {
    int a=5;
    String p ="prashanth";
    /*for(int i=1; i>=a; a++){
        System.out.println(p);
    }*/ 
    switchMethod();
}

 static int b =4;
 public static void switchMethod(){
    //int b=10;
    String monthString;

    //switch statement with int data type
    switch (b){
        //int b =5;
        case 1: monthString ="jan";
        break;
        case 2: monthString ="feb";
        break;
        case 3: monthString ="mar";
        break;
        case 4: monthString ="apr";
        break;
        case 5: monthString ="may";
        break;
        case 6: monthString ="june";
        break;
        case 7: monthString ="july";
        break;
        case 8: monthString ="aug";
        break;
        case 9: monthString="sep";
        break;
        case 10: monthString ="oct";
        break;
        case 11: monthString ="nov";
        break;
        case 12: monthString ="dec";
        break;
        default: monthString ="invalid month";
    }
    System.out.println(monthString);
 }
    
}
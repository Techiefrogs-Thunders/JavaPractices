import java.text.BreakIterator;

public class DateAndTime {
 public static void main(String[] args) {
    String Days = "monday";
    switch (Days)
    {
        //case 1:
        //System.out.println("Today is 01/12/2022"+Days);
        case "monday":System.out.println("Today is 02/12/2022"+Days);
        break;
        case "tuesday":System.out.println("Today is 03/12/2022");
        break;
        case "wednesday":
        System.out.println("Today is 04/12/2022");
        break;
        case "thursday":
        System.out.println("Today is 05/12/2022");
        break;
        case "friday":
        System.out.println("Today is 06/12/2022");
        break;
        case "saturday":
        System.out.println("Today is 07/12/2022");
        break;
    }
}
}

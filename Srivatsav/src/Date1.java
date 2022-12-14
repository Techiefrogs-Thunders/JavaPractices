import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date1 {
    public static void main(String[] args) {    
        LocalDate date = LocalDate.now();    
        LocalDate yesterday = date.minusDays(1);    
        LocalDate tomorrow = yesterday.plusDays(2);    
        System.out.println("Today date: "+date);    
        System.out.println("Yesterday date: "+yesterday);    
        System.out.println("Tomorrow date: "+tomorrow);
        // check leap Year
        LocalDate date1 = LocalDate.of(2017, 1, 13);    
        System.out.println(date1.isLeapYear());    
        LocalDate date2 = LocalDate.of(2016, 9, 23);    
        System.out.println(date2.isLeapYear()); 
        // Time()
        LocalDate date3 = LocalDate.of(2017, 1, 13);  
        LocalDateTime date3time = date3.atTime(1,50,9);      
        System.out.println(date3time);
        // Local Date to String
        LocalDate d1 = LocalDate.now();  
        String d1Str = d1.format(DateTimeFormatter.ISO_DATE);  
        System.out.println("Date in string :  " + d1Str);
        LocalDate d2 = LocalDate.of(1998, 05, 18);  
        String d2Str = d2.format(DateTimeFormatter.ISO_DATE);  
        System.out.println("Date3 in string :  " + d2Str);
        // Without millisecs
        Date currentDate = new Date();  
        System.out.println("Current Date: "+currentDate);  
        String dateToStr = DateFormat.getInstance().format(currentDate);  
        System.out.println("Date Format using getInstance(): "+dateToStr);
        //Time Without seconds
        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);  
        // Time Without Timezone
        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);
        // Time With Timezone    
        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);
      }    
}

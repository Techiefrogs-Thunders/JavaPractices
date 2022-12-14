import java.time.*;
//import java.time.OffsetDateTime;
//import java.time.OffsetTime;

public class Time {
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();  
        int h = offset.getHour();
        OffsetTime offset2 = OffsetTime.now();  
        int m = offset2.getMinute(); 
        OffsetTime offset3Time = OffsetTime.now();  
        int s = offset3Time.getSecond();
        System.out.println(h+ " : "+m+" : "+s);
        OffsetDateTime offsetDT2 = OffsetDateTime.now();  
        System.out.println(offsetDT2.toLocalDate()); 
        OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfWeek());
        OffsetDateTime offset3 = OffsetDateTime.now();  
        OffsetDateTime value =  offset3.minusDays(2);  
        System.out.println(value);  
        
    }
    
}

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Zoned {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();     
        System.out.println(zone);
        ZoneId z = ZoneId.systemDefault();  
        System.out.println(z.getDisplayName(TextStyle.FULL, Locale.ROOT));
        ZoneId zoneid1 = ZoneId.of("America/Chicago");  
        ZoneId zoneid2 = ZoneId.of("Asia/Kolkata");  
        LocalTime id1 = LocalTime.now(zoneid1);  
        LocalTime id2 = LocalTime.now(zoneid2);  
        System.out.println(id1);  
        System.out.println(id2);  
        System.out.println(id1.isBefore(id2));
        System.out.println(id1.isAfter(id2));
        ZoneOffset zone2 = ZoneOffset.ofHours(7);  
        System.out.println(zone2);
    }
    
}

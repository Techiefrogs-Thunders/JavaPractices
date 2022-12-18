package Datetime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class D1 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalDate yesterday=date.minusDays(1);
        LocalDate tomorrow=date.plusDays(1);
        LocalDate d1=LocalDate.of(2020,12,16);
        LocalDateTime t1=d1.atTime(2,59,00);
        LocalTime t2=LocalTime.now();
        LocalTime t3=LocalTime.of(10,43,12);
        //LocalTime t4=t3.minusHours(2);
        //LocalTime t5=t3.minusMinutes(2);
        LocalTime t4=t3.plusHours(2);
        LocalTime t5=t3.plusMinutes(58);
        long hours=ChronoUnit.HOURS.between(t1,t3);
        System.out.println(hours);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t3);
        System.out.println(t2);
        System.out.println(date);
        System.out.println(yesterday);
        System.out.println(tomorrow);
        System.out.println(d1.isLeapYear());
        System.out.println(t1);
        String str1=t1.format(DateTimeFormatter.ISO_DATE);
        System.out.println(str1);
        //using parse() method
        String s1="2022-12-16";//we can only give local date and time localdate
        LocalDate dt1=LocalDate.parse(s1);
        System.out.println(dt1);
    }

   
}

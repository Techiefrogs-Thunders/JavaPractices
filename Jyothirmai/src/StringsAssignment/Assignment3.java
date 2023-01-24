package StringsAssignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Assignment3 {
    public static void main(String[] args) {
        String string = "July 08, 2001";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);

        System.out.println(date);
    }
}

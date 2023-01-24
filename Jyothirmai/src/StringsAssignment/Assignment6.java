package StringsAssignment;

import java.util.Random;

public class Assignment6 {
    public static void main(String[] args) {
        String uppercase = "JYOTHIRMAI";
        String lowercase = "jyothirmai";
        String number = "0123456789";
        String alphanumeric = uppercase+lowercase+number;
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        int length = 10;
        for(int i =0;i<length;i++){
            int index = random.nextInt(alphanumeric.length());
            char randomChar = alphanumeric.charAt(index);
            str.append(randomChar);
        }
        String randomString = str.toString();
        System.out.println("random string is: "+randomString);

    }
}

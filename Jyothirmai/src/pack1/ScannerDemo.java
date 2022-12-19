package pack1;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the value:");
        int i = scannerObj.nextInt();

        System.out.println("My input value is "+i);
    }
}

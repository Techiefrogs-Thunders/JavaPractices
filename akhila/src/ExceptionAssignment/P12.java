package ExceptionAssignment;
import java.io.*;
public class P12 {
    public static void main(String[] args) {
        FileInputStream file=null;
        try{
            file=new FileInputStream("/home/mayur/file.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File does not exist");
        }
    }
}

package ExceptionAssignment;
import java.io.*;
public class P9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file=null;
        try{
            file=new FileInputStream("/home/mayur/file.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File does not exist");
        }
    }
}

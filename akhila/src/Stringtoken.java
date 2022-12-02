import java.util.StringTokenizer;

public class Stringtoken {
    public static void main(String[] args) {
        StringTokenizer s1=new StringTokenizer("I am akhila kakarla");
        StringTokenizer s2=new StringTokenizer("I am,akhila,kakarla,");
        StringTokenizer s3=new StringTokenizer("Hello everyone I am a java developer");
        StringTokenizer s4=new StringTokenizer("Hello I am Akhila Kakarla");
        while(s1.hasMoreTokens()){
            System.out.println(s1.nextToken());
        }
        System.out.println(s2.nextToken(","));
        while(s3.hasMoreElements()){
            System.out.println(s3.nextToken());
        }
        while(s4.hasMoreElements()){
            System.out.println(s4 .nextElement());
        }
    }
}
//hasMoreTokens(): checks if there is more tokens availble.
//nextToken(): returns the next token from the string tokenizer object
//stringnextToken(String delim): returns the next token based on the delimiter
//hasMoreElements(): it is same as hasMoreTokens() 
//nextElement(): it is same as the nextToken()

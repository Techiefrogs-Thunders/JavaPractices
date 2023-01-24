package pack1;

public class ArrayaDemo {
    public static void main(String[] args) {
        int arr[];
        arr = new int[10];
        arr[0] = 9;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 6;
        arr[4] = 5;
        arr[5] = 4;
        arr[6] = 3;
        arr[7] = 2;
        arr[8] = 1;
        arr[9] = 0;
        String strarr[] = new String[5];
        strarr[0] = "hsdbc";
        strarr[1] = "uyfhbv";
        strarr[2] = "jhfbvh";
        strarr[3] = "jfgvjg";
        strarr[4] = "ytegrfv";

        char chararr[] = {'A','B'};

        System.out.println("My array values");
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        for (String s : strarr) {
            System.out.println(s);
        }
        printarray(arr);

        String[] s = myvalues(strarr);

        for(String s1 : s){
            System.out.println(s1);
        }
    }

    static void printarray(int a[]){
        System.out.println("printing from method");

        for(int s : a){
            System.out.println(s);
        }
    }

    static String[] myvalues(String strarr[]){
        strarr[1] = "jyothi";
        return strarr;
    }
}
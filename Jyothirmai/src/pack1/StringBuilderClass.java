package pack1;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("uydfhvbsyfvb vsyfvhbn");
        System.out.println(str.capacity());

        StringBuilder str1 = new StringBuilder("welcome team");
        System.out.println(str1.capacity());

        StringBuilder str2 = new StringBuilder(50);
        str.append("yrghfbyffhjfvjnv");
        System.out.println(str2.capacity());
        }
}

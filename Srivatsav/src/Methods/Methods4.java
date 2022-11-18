package Methods;

public class Methods4{

    public static void main(String[] args) {
        Student x1 = new Student();

        String[] name = new String[]
                {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int[] age = new int[]
                {18, 19, 22, 21, 23, 19, 20, 21, 20, 18};
        String[] address = new String[]
                {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for (int i = 0; i < name.length; i++) {
            x1.setInfo(name[i], age[i], address[i]);
        }
    }
}

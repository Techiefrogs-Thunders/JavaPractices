package HashMapassign;

class P2{
    public static int romanToInt(String s) {
        int num = 0;
        int prev = 0;
        int curr = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    curr = 1;
                    break;
                case 'V':
                    curr = 5;
                    break;
                case 'X':
                    curr = 10;
                    break;
                case 'L':
                    curr = 50;
                    break;
                case 'C':
                    curr = 100;
                    break;
                case 'D':
                    curr = 500;
                    break;
                case 'M':
                    curr = 1000;
                    break;
            }
            num += curr;
            if (prev < curr) {
                num -= 2 * prev;
            }
            prev = curr;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("akhilajyothi"));

    }
}
public class Localvariable2 {
    public static void main(String[] args) {
        int x = 5;
        String s = "sri";
        for(int i = 1; i <= x; ++i){
            System.out.println(s);
        }
        switchMethod(x);
    }

        static int y = 4;
    public static void switchMethod(int x){
        //int y = 10;
        String dayString;

		// Switch statement with int data type
		switch (x) {
			//int y = 5;
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Invalid day";
		}
		System.out.println(dayString);
	}
}
    


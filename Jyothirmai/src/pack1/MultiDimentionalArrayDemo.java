package pack1;

public class MultiDimentionalArrayDemo {
    public static void main(String[] args) {
        int intarr[][] = new int[3][3];
        int a[] = new int[5];
        intarr[0][0] = 1;
        intarr[0][1] = 1;
        intarr[0][2] = 1;
        intarr[1][0] = 2;
        intarr[1][1] = 2;
        intarr[1][2] = 2;
        intarr[2][0] = 3;
        intarr[2][1] = 3;
        intarr[2][2] = 3;

        int[][] otherarr = {{1,2},{4,5,6},{7,8,9,10}};

        for(int i = 0; i<otherarr.length;i++){
            for(int j = 0;j<otherarr[i].length;j++){
                System.out.print(otherarr[i][j]+" ");
            }

            System.out.println();
        }

        int jagarr[][] = new int[3][];

        jagarr[0] = new int[2];
        jagarr[0][0] = 1;
        jagarr[0][1] = 2;
        jagarr[1] = new int[3];
        jagarr[1][0] = 3;
        jagarr[1][1] = 4;
        jagarr[1][2] = 5;
        jagarr[2] = new int[4];
        jagarr[2][0] = 6;
        jagarr[2][1] = 7;
        jagarr[2][2] = 8;
        jagarr[2][3] = 9;

        int newjagarr[][] = jagarr.clone();

        for(int i = 0; i<newjagarr.length;i++){
            for(int j = 0;j<newjagarr[i].length;j++){
                System.out.print(newjagarr[i][j]+" ");
            }
            System.out.println();
        }

        Class c = intarr.getClass();

        System.out.println(c.getName());

        System.out.println(a.getClass().getName());

        String b[] = {"A","B","C","D","E","F","G","H"};
        String d[] = {"1","2","3","4","5","6","7","8","9"};

        System.arraycopy(b, 2, d, 3, 5);

        d = b.clone();

        d[2] ="3";
        for(String s1:d){
            System.out.println(s1);
        }
    }
}
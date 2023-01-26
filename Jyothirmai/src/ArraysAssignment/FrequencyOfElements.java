package ArraysAssignment;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,2,2,5,1};
        int frq[] = new int[arr.length];
        int visited = -1;
        for(int i = 0;i<arr.length;i++){
            int count = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    frq[j] = visited;
                }
            }
            if(frq[i]!=visited)
                frq[i] = count;
        }
        System.out.println("elements|frequency");
        for(int i = 0;i<arr.length;i++){
            if(frq[i]!=visited)
            System.out.println(" "+arr[i]+"  |  "+frq[i]);
        }
    }
}

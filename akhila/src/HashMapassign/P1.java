package HashMapassign;
public class P1 {
  static void twoSum(int[] nums,int target){
    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        if(nums[i]+nums[j]==target){
          System.out.println("Indices : "+i+" "+j);
        }
      }
    }
  }
  public static void main(String[] args) {  
    int[] nums={2,7,11,15};
    int target=9;
    twoSum(nums,target);
  }  
}

package PriorityqueueAssaugnment;

public class P15 {
    static int MaxIncreasingSub(int arr[], int n, int k)
{
    
    int dp[][]=new int[n][k + 1], ans = -1;
 
    for(int i = 0; i < n; i++)
        for(int j = 0; j < k + 1; j++)
            dp[i][j]=-1;
 
    
    for (int i = 0; i < n; i++)
    {
        dp[i][1] = arr[i];
    }
 
    
    for (int i = 1; i < n; i++)
    {
        for (int j = 0; j < i; j++)
        {
 
            
            if (arr[j] < arr[i])
            {
                for (int l = 1; l <= k - 1; l++)
                {
 
                    
                    if (dp[j][l] != -1)
                    {
 
                        
                        dp[i][l + 1] = Math.max(dp[i][l + 1],
                                        dp[j][l] + arr[i]);
                    }
                }
            }
        }
    }
 
    
    for (int i = 0; i < n; i++)
    {
        if (ans < dp[i][k])
            ans = dp[i][k];
    }
 
    
    return (ans == -1) ? 0 : ans;
}
    public static void main(String[] args) {
        int n = 8, k = 3;
    int arr[] = { 8, 5, 9, 10, 5, 6, 21, 8 };
    int ans = MaxIncreasingSub(arr, n, k);
    System.out.println(ans );
    }
}

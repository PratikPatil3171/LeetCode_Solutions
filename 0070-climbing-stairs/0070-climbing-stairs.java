class Solution {
    public int climbStairs(int n) {
        // if(n<=2){
        //     return n;
        // }
        // return climbStairs(n-1)+climbStairs(n-2);

    //     int[] array = new int[n+1];
    //    array[1] = 1;
    //   array[2] = 2;
    //     for(int i=3;i<=n;i++){
    //         array[i] = array[i-1]+array[i-2];
    //     }
    //     return array[n];
    if(n<=2){
        return n;
    }
    int prev1 = 1;
    int prev2 = 2;
    for(int i=3;i<=n;i++){
        int temp = prev1+prev2;
        prev1 = prev2;
        prev2 = temp;
    }
        return prev2;

    }
}
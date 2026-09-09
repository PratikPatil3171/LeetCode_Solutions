class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
            maxSum = lsum;
        }
        int rsum=0;
        int rindex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[rindex];
            maxSum = Math.max(maxSum,lsum+rsum);
            rindex--;
        }
        return maxSum;
    }
}
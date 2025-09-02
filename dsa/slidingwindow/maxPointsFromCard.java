class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            maxScore(new int[]{}, 0);
        }
    }
    static int maxScore(int[] cardPoints, int k) {
        int maxSum = 0;
        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        } //left wale ka sum
        maxSum = lsum;
        int rindex = cardPoints.length - 1; //window shift and adding right wale ka sum
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[rindex--];
            maxSum = Math.max(maxSum, lsum + rsum);
        }
        return maxSum;
    }
}

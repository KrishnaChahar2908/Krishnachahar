class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length;

       int bestending = nums[0];
       int Answer = nums[0];

       for(int i=1;i<n;i++){

        int value1 = bestending + nums[i];
        int value2 = nums[i];

        bestending = Math.max(value1,value2);
        Answer = Math.max(Answer,bestending);

       }
       return Answer;
    }
}
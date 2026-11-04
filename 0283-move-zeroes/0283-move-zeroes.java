class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;

        int i = 0;
        for(int j = i; j <n ;j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
                k++;
            }
        }

        for(int j = k ;j < n;j++){
            nums[j] = 0;
        }
    }
}
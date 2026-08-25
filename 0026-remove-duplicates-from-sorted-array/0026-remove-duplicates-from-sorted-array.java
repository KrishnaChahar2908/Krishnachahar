class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;

        for(int j=1;j<n;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];    // nums[j] ki value nums[i] me rewrite !
            }
        }
        return i+1; // Because length return krni hai and indexing starts from 0!
    }
}
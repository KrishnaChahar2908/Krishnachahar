class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int res = 0;

        int zero = 0;
        int one = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                one ++;
            }else{
                zero++;
            }

            int difference  = zero - one;

            if(difference == 0){
                res = Math.max(res,i+1);
            }else if(map.containsKey(difference)){
                int idx = map.get(difference);
                res = Math.max(res,i-idx);
            }else{
                map.put(difference,i);
            }
        }
        return res;
    }
}
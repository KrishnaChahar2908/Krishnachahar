class Solution {
    public boolean containsDuplicate(int[] nums) {
       int n = nums.length;
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int i=0;i<n;i++){

        int p = nums[i];

        map.put(p,map.getOrDefault(p,0)+1);

        if(map.get(p) > 1){
            return true;
        }
       }
       return false;
    }
}
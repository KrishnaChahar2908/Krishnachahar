class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;

        Stack<Integer> st = new Stack<>();

        st.push(nums[n-1]);

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(nums[i]);
        }
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }

            if (res[i] == -1) {
                if (!st.isEmpty()) {
                    res[i] = st.peek();
                }
            }

            st.push(nums[i]);
        }
        return res;
    }
}
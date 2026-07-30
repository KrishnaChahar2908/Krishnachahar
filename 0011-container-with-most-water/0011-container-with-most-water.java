class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int left = 0;
        int right = n-1;
        int maxarea = 0;

        while(left<right){
            int width = right - left;
            int heightt = Math.min(height[left] ,height[right]);
            int area = width * heightt;

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }

            maxarea = Math.max(maxarea,area);
        }
        return maxarea;
    }
}
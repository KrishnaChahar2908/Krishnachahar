class Solution {

    private int max(int[] piles){
        int l = piles.length;

        int maxnum = 0;

        for(int i=0;i<l;i++){
            int max = piles[i];

            maxnum = Math.max(max,maxnum);
        }
        return maxnum;
    }

    private long fun(int[] piles , int n , int speed){
        long h = 0;
        for(int i=0;i<n;i++){
            h = h + piles[i] / speed;
            if(piles[i] % speed != 0){
                h++;
            }
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = max(piles);

        int res = -1;

        while(low<=high){
            int mid = low + (high - low)/2;
            long hour = fun(piles,n,mid);

            if(hour > h){
                low = mid + 1;
            }else{
                res = mid;
                high = mid -1;
            }
        }
        return res;
    }
}
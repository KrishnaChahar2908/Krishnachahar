class Solution {
    void BackTrack(List<String> ans ,String curr ,int open , int close , int n){
        //Base Case 
        if(curr.length() == n*2){
            ans.add(curr);
            return; //Return to previous call 
        }

        if(open < n){  //Opening 
            BackTrack(ans,curr + "(" , open +1,close , n);
        }
        if(close < open){  //Closing 
            BackTrack(ans,curr + ")" , open,close +1,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        BackTrack(ans,"",0,0,n);
        return ans;
    }
}
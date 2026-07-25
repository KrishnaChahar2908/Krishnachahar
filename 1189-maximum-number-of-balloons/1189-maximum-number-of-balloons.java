class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            have.put(ch,have.getOrDefault(ch,0)+1);
        }


        String word = "balloon";
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            need.put(ch,need.getOrDefault(ch,0)+1);
        }

        int ans = Integer.MAX_VALUE;

        for(char ch : need.keySet()){
            if(!have.containsKey(ch)){
                return 0;
            }

            int count = have.get(ch) / need.get(ch);
            ans = Math.min(ans,count);
        }

        return ans;

    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        int left1 = 0;
        int left2 = 0;

        while(left1 < s.length() && left2 < t.length()){
            char ch1 = s.charAt(left1);
            char ch2 = t.charAt(left2);

            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);

            left1++;
            left2++;
        }

        return map1.equals(map2);

    }
}
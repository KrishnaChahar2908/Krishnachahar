class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(char ch : map1.keySet()){
            if(!check(map1,map2,ch)){
                return false;
            }
        }
        return true;

    }
    private boolean check(HashMap<Character,Integer>map1 , HashMap<Character,Integer > map2 , char ch){
        if(!map2.containsKey(ch)){
            return false;
        }
        if(map1.get(ch) > map2.get(ch)){
            return false;
        }
        return true;
    }
}
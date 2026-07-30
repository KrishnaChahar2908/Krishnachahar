class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] arr = word.toCharArray();

            Arrays.sort(arr);

            String sortedWord = new String (arr);

            if(map.containsKey(sortedWord)){
                map.get(sortedWord).add(word);
            }else{
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sortedWord,list);
            }

        }
        return new ArrayList<>(map.values());
    }
}
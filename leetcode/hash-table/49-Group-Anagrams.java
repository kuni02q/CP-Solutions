class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> anagrams = new ArrayList<>();
        Map<String, List<String>> map = new HashMap();

        for(int i = 0; i < strs.length; i++){
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            String sortedString = new String(sorted);

            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(strs[i]);

        }

        return new ArrayList<>(map.values());
        
    }
}
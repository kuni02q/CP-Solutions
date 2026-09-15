class Solution {
    public int appendCharacters(String s, String t) {

        int answer = t.length();

        int tIndex = 0;
        for(int i = 0; i < s.length(); i++){

            if(t.charAt(tIndex) == s.charAt(i)){
                tIndex++;

                if(tIndex == answer) break;
            }


        }

        return answer - tIndex;
        
    }
}
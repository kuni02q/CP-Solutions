class Solution {
    public String longestCommonPrefix(String[] strs) {

        String answer = strs[0];

        for(int i = 1; i < strs.length; i++){

            int min = Math.min(answer.length() , strs[i].length());
            String recentAnswer = "";

            for(int j = 0; j < min; j++){

                if(answer.charAt(j) == strs[i].charAt(j)){
                    recentAnswer = recentAnswer + answer.charAt(j);
                }
                else break;

            }

            answer = recentAnswer;

        }

        return answer;
        
    }
}
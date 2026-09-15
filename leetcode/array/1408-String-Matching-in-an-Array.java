class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> answer = new ArrayList<String>();

        for(int i = 0; i < words.length; i++){

            for(int j = 0; j < words.length; j++){

                if(words[i].length() >= words[j].length()){
                    continue;
                }
                
                if(words[j].contains(words[i]) && !answer.contains(words[i])){
                    answer.add(words[i]);
                }

            }

        }

        return answer;


    }
}
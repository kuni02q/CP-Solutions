class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        int answer = 0;
        int max = 1;

        for(int i = s.length()-1; i >= 0; i--){
            int temp = map.get(s.charAt(i));

            if (temp < max){
                answer -= temp;
            }
            else{
                answer += temp;
                max = temp;
            }

        }

        return answer;


    }
}
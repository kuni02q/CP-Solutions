class Solution {
    public int digitFrequencyScore(int n) {
        
        int sum = 0;
        int n2 = n;

        while (n2 > 0){
            sum += n2 % 10;
            n2 = n2/10;
        }

        return sum;


    }
}
class Solution {
    public boolean isPalindrome(int x) {
        
        int num = x;
        int reverse = 0;

        while(num > 0){
            int remnant = num % 10;
            reverse = reverse*10 + remnant;
            num = num/10;
        }

        return x == reverse;


    }
}
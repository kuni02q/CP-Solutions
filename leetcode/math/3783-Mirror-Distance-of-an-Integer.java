class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int reverse = 0;
        int remnant = 0;


        while (num > 0){
            remnant = num % 10;
            reverse = reverse * 10 + remnant;
            num = num / 10;
        }

        return Math.abs(n - reverse);


    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 1;
        int recent = 1;
        boolean has1 = false;

        for(int i = 0; i < nums.length-1; i++){

            if(nums[i] == 1 || nums[i+1] == 1) has1=true;

            if(nums[i] == 1 &&  nums[i+1] == 1){
                recent++;
                if(recent>max){
                    max = recent;
                }
            }
            else recent = 1;

        }
        if(nums[0] == 1) has1=true;

        return has1 ? max : 0;

    }
}
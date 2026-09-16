class Solution {
    public int removeElement(int[] nums, int val) {

        int goodIndex = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != val){
                nums[goodIndex] = nums[i];
                goodIndex++;
            }

        }

        return goodIndex;

    }
}
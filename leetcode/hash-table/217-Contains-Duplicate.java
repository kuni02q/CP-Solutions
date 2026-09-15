class Solution {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();


        for(int i = 0; i < nums.length; i++){

            if (set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);

        }

        return false;
        
    }
}
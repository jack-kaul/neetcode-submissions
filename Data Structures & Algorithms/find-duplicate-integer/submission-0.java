class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[nums[i]-1] < 0) return nums[nums[i]-1]*-1;
            nums[nums[i]-1] = nums[nums[i]-1]*-1;
        }
        return -1; 
    }
}

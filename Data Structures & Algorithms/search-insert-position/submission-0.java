class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int curr = 0;
        while(left <= right) {
            curr = left + (right - left)/2;
            if(nums[curr] == target) {
                break;
            } else if(target < nums[curr]) {
                right = curr - 1;
            } else {
                left = curr + 1;
            }
        }
        if(nums[curr] == target) {
            return curr;
        } else {
            if(target > nums[right]) {
                return right + 1;
            } else {
                return right-1;
            }
        }
    }
}
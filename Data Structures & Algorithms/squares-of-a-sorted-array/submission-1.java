class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start<end) {
            if(Math.abs(nums[start]) > Math.abs(nums[end])) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp*temp;
            } else {
                nums[end] = nums[end]*nums[end];
            }
            end--;
        }
        nums[start] = nums[start]*nums[start];
        return nums;
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, (k - 1)%nums.length);
        reverseArray(nums, k%nums.length, nums.length - 1);
        return;
    }

    private void reverseArray(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return;
    }
}
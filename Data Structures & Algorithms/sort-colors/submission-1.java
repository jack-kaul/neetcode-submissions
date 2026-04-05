class Solution {
    public void sortColors(int[] nums) {
        //0 1 2 1 0 1 2 2
        int start=0, end = nums.length-1, i=0;
        while(i <= end) {
            if(nums[i] == 0) {
                while(start < i && nums[start] == 0) {
                    start++;
                }
                nums[i++] = nums[start];
                nums[start++] = 0;
            } else if(nums[i] == 2) {
                while (end > i && nums[end] == 2) {
                    end--;
                }
                nums[i++] = nums[end];
                nums[end--] = 2;
            } else {
                i++;
            }
        }
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int curr = (start+end)/2;
        while(curr!= start && curr!=end) {
            if(target == nums[curr]) {
                return curr;
            }
            if(target < nums[curr]) {
                end = curr;
            } else {
                start = curr;
            }
            curr = (start+end)/2;
        }
        return -1;
    }
}

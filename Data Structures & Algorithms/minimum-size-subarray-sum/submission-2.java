class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];

        for(int i=1; i<n; i++) {
            sum[i] = sum[i-1] + nums[i];
        }

        if(sum[n-1] < target) return 0;

        int l=0, r=0, min=n;
        while(r < n) {
            if(sum[r]-sum[l]+nums[l] >= target) {
                if(r-l+1 < min) min = r-l+1;
                l++;
            } else {
                r++;
            }
        }
        return min;
    }
}
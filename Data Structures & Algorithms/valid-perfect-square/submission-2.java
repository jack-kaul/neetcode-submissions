class Solution {
    public boolean isPerfectSquare(int num) {
        int left=0, right = num;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(long(mid*mid) == num) return true;
            if(mid*mid > num) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
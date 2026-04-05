class Solution {
    public boolean isPerfectSquare(int num) {
        int left=0, right = num;
        while(left < right) {
            int mid = (left+right)/2;
            if(mid*mid == num) return true;
            if(mid*mid > num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
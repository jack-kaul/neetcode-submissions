class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int area = 0;
        while(l < r) {
            int curr_area = Math.min(heights[r],heights[l])*(r-l);
            if(curr_area > area) area = curr_area;
            if(r > l) l++;
            else r--;
        }
        return area;
    }
}

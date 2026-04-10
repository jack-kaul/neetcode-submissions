class Solution {
    public int[][] merge(int[][] intervals) {
        // Edge case
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // Step 2: Start with first interval
        int[] current = intervals[0];
        result.add(current);

        // Step 3: Traverse and merge
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            // If overlapping
            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                current = next;
                result.add(current);
            }
        }

        // Convert List to array
        return result.toArray(new int[result.size()][]);
    }
}

import java.util.Arrays;

public class intervals {
    public static void main(String[] args) {
        // Example input: list of intervals
        int[][] intervals = {
            {1, 2},
            {2, 3},
            {3, 4},
            {1, 3}
        };

        Solution sol = new Solution();
        int result = sol.eraseOverlapIntervals(intervals);
        System.out.println("Minimum number of intervals to remove: " + result);
    }
}
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1]; 
            } else {
                count++; 
            }
        }

        return count;
    }
}
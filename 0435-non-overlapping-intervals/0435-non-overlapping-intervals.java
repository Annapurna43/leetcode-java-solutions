class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int result = 0;
        int[] temp = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (temp[1] > intervals[i][0]) {
                result++;
                if (intervals[i][1] < temp[1]) {
                    temp = intervals[i];
                }
            }
            else{
                temp = intervals[i];
            }

        }
        return result;
    }
}
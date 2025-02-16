import java.util.Arrays;

public class MergerInterval {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> Integer.compare(a[0], b[0]));
        int count = 1;                          // At least one interval exists
int max = intervals[0][1];              // Track the end of the first interval

for (int i = 1; i < intervals.length; i++) {
    if (max >= intervals[i][0]) {       // Overlapping case
        max = Math.max(max, intervals[i][1]);  // Extend the current interval
    } else {                            // Non-overlapping case
        count++;                        // New merged group
        max = intervals[i][1];          // Update max for the new group
    }
}
        int res[][]=new int[count][2];
        res[0]=intervals[0];
        int i=0;
        for(int j=1;j<intervals.length;j++){
            if(res[i][1]>=intervals[j][0]){
                res[i][1]=Math.max(intervals[j][1],res[i][1]);
            }else{
                res[++i]=intervals[j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[][] = {
                // { 1, 4 },
                // { 5, 8 },
                // { 2, 6 },
                // { 10, 12 },
                // { 15, 20 },
                // { 18, 22 }
                {2,3},
                {4,5},
                {6,7},
                {8,9},
                {1,10}
        };
        merge(arr);
    }
}

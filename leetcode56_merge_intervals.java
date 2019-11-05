import java.util.*;
public class leetcode56_merge_intervals {

    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return new int[0][0];
        List<List> res = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] > end){
                List<Integer> slice = new ArrayList<>();
                slice.add(start);
                slice.add(end);
                res.add(slice);
                start = intervals[i][0];
                end = intervals[i][1];

            }else{
                end = Math.max(intervals[i][1], end);
            }

        }
        List<Integer> last = new ArrayList<>();
        last.add(start);
        last.add(end);
        res.add(last);

        int[][] all = new int[res.size()][2];
        for(int i = 0; i< res.size(); i++){

            all[i][0]  = (int)res.get(i).get(0);
            all[i][1] = (int)res.get(i).get(1);
        }
        return all;




    }
}

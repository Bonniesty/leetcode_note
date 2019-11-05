import java.util.*;

public class leetcode296_best_meeting_point {
    public int minTotalDistance(int[][] grid) {
        List<Integer> ipos = new ArrayList<Integer>();
        List<Integer> jpos = new ArrayList<Integer>();
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j< grid[0].length; j++){
                if(grid[i][j] == 1){
                    ipos.add(i);
                    jpos.add(j);

                }
            }
        }

        Collections.sort(ipos);
        Collections.sort(jpos);
        int i = 0, j = ipos.size()-1;
        int sum = 0;
        while(i < j){
            sum = sum + ipos.get(j)- ipos.get(i);
            sum = sum + jpos.get(j)- jpos.get(i);
            i++;
            j--;
        }
        return sum;


    } public static void main(String[] args){
        leetcode296_best_meeting_point test = new leetcode296_best_meeting_point();
        //System.out.println(test.minTotalDistance());
    }


}

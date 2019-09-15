import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode39_combination_sum {


        public List<List<Integer>> combinationSum(int[] candidates, int target) {

            List<List<Integer>> res = new ArrayList<List<Integer>>();
            if(candidates == null || candidates.length == 0 ) return res;
            Arrays.sort(candidates);
            helper(candidates, 0 , target ,res, new ArrayList<Integer>());
            return res;
        }
        private void helper( int[] candidate, int i, int target, List<List<Integer>> res, List<Integer> temp){

            if( target == 0 ){
                res.add(new ArrayList<>(temp));
                return;
            }
            if(target < 0){
                return;
            }
            for( int j = i; j< candidate.length; j++){
                temp.add(candidate[j]);
                helper(candidate, j, target-candidate[j] , res, temp);
                temp.remove(temp.size()-1);

            }


        }


    

}

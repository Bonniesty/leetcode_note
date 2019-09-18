import java.util.List;

public class leetcode139_word_break {


    public boolean wordBreak(String s, List<String> wordDict) {

        if(s==null || s.length() == 0 ) return false;
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = false;
        for(int i=0; i< s.length(); i++){
            for(String word : wordDict){
                if(i-word.length()+1 == 0 && word.equals(s.substring(0,i+1)) ){
                    dp[i] =true;
                }
                if(i-word.length() >= 0 && dp[i-word.length()] && word.equals(s.substring(i-word.length()+1,i+1))  )
                    dp[i] = true;

            }

        }
        return dp[s.length()-1];

    }


}

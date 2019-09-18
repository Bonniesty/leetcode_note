public class leetcode5_longest_palindromic_substring {


    String res = "";
    public String longestPalindrome(String s) {

        if(s== null || s.length() == 0) return s;
        for(int i=0; i<s.length();i++){
            helper(s,i,i);
            helper(s,i,i+1);
        }
        return res;
    }

    private void helper(String s, int left, int right){
        while(left >= 0 && right < s.length() &&  s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        String temp = s.substring(left+1, right);
        if(temp.length() > res.length()){
            res = temp;

        }
    }
}

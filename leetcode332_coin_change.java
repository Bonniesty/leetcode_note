import java.util.Arrays;

public class leetcode332_coin_change {


    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] res = new int[amount+1];
        Arrays.fill(res, amount);
        res[0]=0;
        for(int i = 1; i<= amount; i++){
            int min = amount;
            for(int j = 0; j< coins.length; j++){
                if(i-coins[j] >= 0 && res[i-coins[j]] != amount  ){
                    min =  Math.min(res[i-coins[j]]+1 , min);
                }
            }
            res[i] = min;

        }
        return (res[amount] == amount) ? -1 : res[amount] ;



    }
}

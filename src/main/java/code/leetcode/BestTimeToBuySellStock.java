package code.leetcode;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit( prices));
    }
    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
        }
        int maxProfit=0;
        int minSoFar = prices[0];
        for (int index =0; index<prices.length;index++){
            minSoFar = Math.min(minSoFar,prices[index]);
            int tempProfit= prices[index]-minSoFar;
            maxProfit = Math.max(maxProfit,tempProfit);
        }
        return maxProfit;
    }
}

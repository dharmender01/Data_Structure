package Array;

public class Buy_Sell_oneTime {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<prices.length; i++){
            if(prices[i]<min) min = prices[i];
            if(max < prices[i]-min){
                max = prices[i]-min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}

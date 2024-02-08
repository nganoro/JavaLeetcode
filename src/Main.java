public class Main {
    public static int buyAndStock(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            } else {
                max += prices[i] - min;
                min = prices[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buyAndStock(prices));
    }
}
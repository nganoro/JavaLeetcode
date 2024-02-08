public class buyStock {
    public static int stock(int[] stocks){
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i<stocks.length-1; i++){
            if(stocks[i+1] > stocks[i]){
                profit += stocks[i+1] - stocks[i];
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};

        System.out.println(stock(prices));
    }
}

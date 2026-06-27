import java.util.Scanner;
public class BuySellStock {
    public static int maxPrice(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            else{
                int profit = prices[i] - buyPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter stock prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("Maximum Profit: "+maxPrice(prices));
    }
}

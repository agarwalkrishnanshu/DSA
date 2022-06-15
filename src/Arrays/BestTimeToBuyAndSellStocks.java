/*
    Problem: You are given an array prices where prices[i] is the price of a given stock on the ith day.
    URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    It is a brute force approach I developed for solving the stock buying and selling problem to maximize profit
    Time Limit Exceeds for this solution
    199/211 test cases passed
*/
package Arrays;
class BestTimeToBuyAndSellStocks {
    public static int[] removeElement(int[] prices, int index) {
        int newPrices[] = new int[prices.length - 1];
        int j = 0;
        System.out.println("Removing element at: " + index + " prices length: " + prices.length);
        for (int i = 0; i < prices.length; i++) {
            if (i != index) {
                newPrices[j] = prices[i];
                j++;
            }
        }
        return newPrices;
    }

    public static int maxProfit(int[] prices) {
        System.out.println("New Call to maxProfit: ");
        System.out.println("Array: ");
        print(prices);
        if (prices.length <= 1) {
            System.out.println("Length <= 1 Returning 0");
            return 0;
        }
        if (isDesc(prices)) {
            System.out.println("isDesc true Returning 0");
            return 0;
        }
        prices = filter(prices);
        System.out.println("Array after filtering: ");
        // print(prices);

        int profit = 0;
        int buyDay = 0;
        int sellDay;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[buyDay]) {
                buyDay = i;
            }
        }
        // prices = removeAllBeforeBuyDay(prices, buyDay);
        // buyDay = 0;
        // System.out.println("Array after removing before buy day: ");
        // print(prices);

        if (buyDay == prices.length - 1) {
            // System.out.println("buyDay == prices length-1");
            System.out.print("Array after removing: " + buyDay);
            // print(newPrices);
            // return maxProfit(newPrices);
        }

        sellDay = buyDay + 1;
        System.out.println("buyDay: " + buyDay + " sellDay: " + sellDay);
        for (int i = buyDay + 2; i < prices.length; i++) {
            // System.out.println(" i " + i + " sellDay "+ sellDay);
            if (prices[i] > prices[sellDay] && prices[i] > prices[buyDay]) {
                sellDay = i;
            }
        }
        System.out.println("final buyDay: " + buyDay + " final sellDay: " + sellDay);
        System.out.println("prices length: " + prices.length);
        System.out.print("Array: ");
        // print(prices);
        profit = prices[sellDay] - prices[buyDay];
        System.out.println("Profit: " + profit);

        int newPrices[] = removeElement(prices, buyDay);
        System.out.print("Array after removing: " + buyDay);
        // print(newPrices);

        newPrices = removeElement(newPrices, sellDay - 1);

        System.out.print("Array after removing: " + (sellDay - 1));
        // print(newPrices);
        int maxProfit = maxProfit(newPrices);

        if (profit > maxProfit) {
            maxProfit = profit;
        }
        return maxProfit;
    }

    public static void print(int prices[]) {
        System.out.println("Prices Length: " + prices.length);
        if (prices.length > 100)
            return;
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println();
    }

    public static Boolean isDesc(int prices[]) {
        boolean isDesc = true;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                // System.out.println("Changin is Desc for: "+prices[i] +" "+prices[i+1]);
                isDesc = false;
            }
        }
        return isDesc;

    }

    public static int[] removeAllBeforeBuyDay(int prices[], int buyDay) {
        System.out.println("removeAllBeforeBuyDay for: " + buyDay + " Prices length " + prices.length);
        if (buyDay == prices.length - 1) {
            return new int[0];
        }
        int newPrices[] = new int[prices.length - buyDay];

        for (int i = 0; i < newPrices.length; i++) {
            newPrices[i] = prices[buyDay + i];
        }
        return newPrices;
    }

    public static int[] filter(int prices[]) {

        int index = -1;
        for (int i = prices.length - 1; i > 0; i--) {
            if (prices[i - 1] < prices[i]) {
                index = i;
                break;
            }
        }
        int newPrices[] = new int[index + 1];

        for (int i = 0; i < newPrices.length; i++) {
            newPrices[i] = prices[i];
        }
        return newPrices;

    }

    public static void main(String[] args) {
        int input1[] = { 7, 1, 5, 3, 6, 4 };
        int input2[] = { 3, 2, 6, 5, 0, 3 };
        int input3[] = { 7, 6, 4, 3, 1 };
        int input4[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0 };

        System.out.println(maxProfit(input1));
        System.out.println(maxProfit(input2));
        System.out.println(maxProfit(input3));
        System.out.println(maxProfit(input4));
    }
}
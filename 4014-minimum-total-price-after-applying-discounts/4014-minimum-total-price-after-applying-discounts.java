class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double price = 0;

        int i = prices.length-1;
        int j = discounts.length-1;

        while(i >= 0 && j >=0){
            price += (double) prices[i] * (100 - discounts[j]) / 100; 
            i--;
            j--;
        }

        for(int k = i; k>=0; k--){
            price += prices[k];
        }

        return price;
    }
}
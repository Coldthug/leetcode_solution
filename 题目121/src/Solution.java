import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {




        int q=0,max=0;
        int price_arr[]=new int[100000];
        while(q<prices.length){
            int p=q+1;
            while (p<prices.length){
                if (prices[p]-prices[q]>max){
                    max=prices[p]-prices[q];

                }
                p++;
            }
            p++;
            q++;
        }


        return max;
    }
}
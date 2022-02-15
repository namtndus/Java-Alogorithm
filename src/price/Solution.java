package price;

public class Solution {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int min= 0;
        int minIndex = 0;
        int max= 0;
        for(int i = 0; i<prices.length; i++){
            if(i == 0){
                min = prices[i];
            }else{
                if(min > prices[i]){
                    min = prices[i];
                    minIndex = i;
                }
            }
        }
        if(minIndex == prices.length-1){
            System.out.println(0);
        }
        for(int i = minIndex+1; i<prices.length; i++){
            if(i == minIndex+1){
                max = prices[i];
            }else{
                if(max < prices[i]){
                    max = prices[i];
                }
            }
        }
        System.out.println(max - min);
    }
}

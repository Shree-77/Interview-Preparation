package Array_Problems;

public class BuyandSell {
    public static void main(String[] args) {
        int[]arr= new int[]{1,5,2,3,7,6,4,5};
        int[]arr1=new int[]{5,5,10,8,7,6,4,5,2,6,1,10};
        System.out.println(profit(arr));
    }
    public static int profit(int[] arr) {
        int profit = 0;
        int buyingHour = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (buyingHour == -1) {
                    buyingHour = i;
                }
                profit += arr[i + 1] - arr[i];
            } else if (buyingHour != -1) {
                buyingHour = -1;
            }
        }

        return profit;
    }

}

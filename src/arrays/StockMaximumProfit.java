package arrays;

import java.util.Arrays;

public class StockMaximumProfit {

    /*
   Math.abs()  --> removes negative signs and give a value
    */
    public static void main(String args[]) {

        int[] input = {14, 12, 70, 15, 99, 65, 21, 90};

        findPairWhoseSumIsCloseToZero(input);
    }

    private static void findPairWhoseSumIsCloseToZero(int[] input) {

        Arrays.sort(input);


        int l = 0;
        int r = input.length - 1;
        int maxValue = Integer.MIN_VALUE;

        int left_pointer = l;
        int right_pointer = input.length - 1;

        while (l < r) {

            int sum = input[l] - input[r];

            if (Math.abs(sum) > Math.abs(maxValue)) {
                maxValue = sum;
                left_pointer = l;
                right_pointer = r;
            }

            if (sum < 0) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println(input[left_pointer] + " " + input[right_pointer]);
    }
}

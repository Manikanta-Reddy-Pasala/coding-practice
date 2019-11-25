package arrays;

import java.util.Arrays;

public class PairSumCloseToZero {


    /*
    Math.abs()  --> removes negative signs and give a value
     */
    public static void main(String args[]) {

        int[] input ={1,3,-5,7,8,20,-40,6};
//        int[] input = {-40, -5, 1, 3, 6, 7, 8, 20};

        findPairWhoseSumIsCloseToZero(input);
    }

    private static void findPairWhoseSumIsCloseToZero(int[] input) {

        Arrays.sort(input);


        int l = 0;
        int r = input.length - 1;
        int minimum = Integer.MAX_VALUE;

        int left_pointer = l;
        int right_pointer = input.length - 1;

        while( l < r) {

            int sum = input[l] + input[r];

            if( Math.abs(sum) < Math.abs(minimum)) {
                minimum = sum;
                left_pointer = l;
                right_pointer = r;
            }

            if(sum < 0) {
                l ++;
            }
            else {
                r--;
            }
        }

        System.out.println(input[left_pointer] + " " + input[right_pointer]);
    }
}

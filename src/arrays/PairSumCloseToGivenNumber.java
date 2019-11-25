package arrays;

import java.util.Arrays;

public class PairSumCloseToGivenNumber {

    /*
    Math.abs()  --> removes negative signs and give a value
    sort array
    start from left pointer and right pointer
    add  one left pointer with right pointer then based  on results decide
     */
    public static void main(String args[]) {

        int[] input ={-40,-5,1,3,6,7,8,20};

        findPairWhoseSumIsCloseToZero(input);
    }

    private static void findPairWhoseSumIsCloseToZero(int[] input) {

        Arrays.sort(input);


        int l = 0;
        int r = input.length - 1;

        int left_pointer = l;
        int right_pointer = input.length - 1;

        while( l < r) {

            int sum = input[l] + input[r];

            if( Math.abs(sum) < 5) {
                left_pointer = l;
                right_pointer = r;
            }

            if(sum < 5) {
                l ++;
            }
            else {
                r--;
            }
        }

        System.out.println(input[left_pointer] + " " + input[right_pointer]);
    }
}

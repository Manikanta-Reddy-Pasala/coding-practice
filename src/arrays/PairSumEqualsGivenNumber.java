package arrays;

import java.util.Arrays;

public class PairSumEqualsGivenNumber {

    public static void main(String args[]) {

        int[] input ={-40,-5,1,3,6,7,8,20};

        pairSumEqualsGivenNumber(input);
    }

    private static void pairSumEqualsGivenNumber(int[] input) {

        Arrays.sort(input);
        
        int l = 0;
        int r = input.length - 1;

        int left_pointer = l;
        int right_pointer = input.length - 1;

        while( l < r) {

            int sum = input[l] + input[r];

            if( sum == 15) {
                left_pointer = l;
                right_pointer = r;
                System.out.println(input[left_pointer] + " " + input[right_pointer]);;
            }

            if(sum < 15) {
                l ++;
            }
            else {
                r--;
            }
        }
    }
}

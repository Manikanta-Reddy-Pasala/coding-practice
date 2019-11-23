package arrays;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String args[]) {

        int[] array = {1, 2, 3, 5, 6, 7};

        System.out.println(findMissingNumber_basic(array));
        System.out.println(findMissingNumber_approach_2(array));

    }

    private static int findMissingNumber_basic(int[] array) {

        Arrays.sort(array);
        int i;
        for (i = 1; i <= array.length; i++) {

            if (array[i - 1] != i)
                return i;
        }
        return i;
    }

    /*
    Find the sum of n number using formula n=n*(n+1)/2
    Find the sum of elements present in given array.
    Substract (sum of n numbers – sum of elements present in the array).
     */

    private static int findMissingNumber_approach_2(int[] array) {

        int total = ((array.length + 1) * ((array.length + 1) + 1)) / 2;
        int actual_sum = 0;

        for (int i = 0; i < array.length; i++) {

            actual_sum = actual_sum + array[i];
        }
        return total - actual_sum;
    }
}

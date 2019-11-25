package arrays;

/*
Given an array of 0’s and 1’s in random order, you need to separate 0’s and 1’s in an array.
 */
public class SeparateZeroOnes {

    public static void main(String args[]) {

        int[] arr = {0, 1, 0, 0, 1, 1, 1, 0, 1};

        separate(arr);
    }

    private static void separate(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0)
                count++;
        }

        for (int j = 0; j < arr.length; j ++) {

            if(count > 0) {
                System.out.print("0");
                count--;
            } else {
                System.out.print("1");
            }
        }

    }
}

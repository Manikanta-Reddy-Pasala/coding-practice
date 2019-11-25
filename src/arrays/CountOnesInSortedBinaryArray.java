package arrays;

public class CountOnesInSortedBinaryArray {

    public static void main(String args[]) {

        int[] arr = {0, 0, 0, 1, 1, 1, 1};

        countOnes(arr);
    }

    private static void countOnes(int[] arr) {

        int left = 0;
        int right = arr.length-1;
        int count = 0;

        if (arr[left] == 1) {

            while (arr[left] != 0) {

                count++;
                left++;

            }

        } else if (arr[right] == 1) {

            while (arr[right] != 0) {

                count++;
                right--;
            }
        }

        System.out.println(count);
    }
}

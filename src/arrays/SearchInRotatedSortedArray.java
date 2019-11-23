package arrays;

public class SearchInRotatedSortedArray {

    public static void main(String args[]) {

        //int[] array = {16, 19, 21, 25, 3, 5, 8, 10};

        int[] array = {16, 19, 21, 25, 27, 35, 50, 70, 3, 5, 8, 10};

        System.out.println(search(array, 0, array.length - 1));

    }

    private static boolean search(int[] array, int start, int end) {

        int find = 8;
        while (start < end) {

            int mid = 0;

            mid = start + ((end - start) / 2);

            if (array[mid] == find) {
                return true;
            }

            if (array[start] < array[mid] && find < array[mid] && find > array[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}

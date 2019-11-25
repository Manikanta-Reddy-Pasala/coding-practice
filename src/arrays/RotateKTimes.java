package arrays;

public class RotateKTimes {

    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        rotate(arr, 2);

        arr = new int[]{1, 2, 3, 4, 5, 6};
        /*
        reverse full array
        reverse first k elements
        reverse rest of elements
         */
        rotate_method(arr, 2);
    }

    private static void rotate_method(int[] arr, int k) {

        System.out.println();

        int[] rev = reverse_array(arr, 0, arr.length - 1);

        for (int j = 0; j < rev.length; j++) {
            System.out.print(rev[j] + " ");
        }

        System.out.println();
        rev = reverse_array(arr, 0, k - 1);

        for (int j = 0; j < rev.length; j++) {
            System.out.print(rev[j] + " ");
        }
        System.out.println();

        rev = reverse_array(arr, k, arr.length - 1);
        for (int j = 0; j < rev.length; j++) {
            System.out.print(rev[j] + " ");
        }

    }

    private static int[] reverse_array(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    private static void rotate(int[] arr, int k) {

        while (k != 0) {

            int i = 0;
            int temp = 0;
            for (i = arr.length - 1; i > 0; i--) {
                temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
            k--;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

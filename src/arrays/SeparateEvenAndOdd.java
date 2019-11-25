package arrays;

public class SeparateEvenAndOdd {

    public static void main(String args[]) {

        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};

        separate(arr);
    }

    private static void separate(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        int right_ = 0;
        int left_ = 0;

        while (left < right) {

            if (right_ > 0 && left_ > 0) {

                int dummy = arr[left];
                arr[left] = arr[right];
                arr[right] = dummy;

                right_ = 0;
                left_ = 0;
            }

            if (arr[left] % 2 == 0 && left_ == 0) {
                left++;
            } else {
                left_ = arr[left];
            }
            if (arr[right] % 2 != 0 && right_ == 0) {
                right--;

            } else {
                right_ = arr[right];
            }
        }


        for(int j=0; j< arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}

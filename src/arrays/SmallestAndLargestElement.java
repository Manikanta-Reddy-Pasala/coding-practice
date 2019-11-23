package arrays;

public class SmallestAndLargestElement {

    public static void main(String args[]) {

        int[] array = {1, 2, 3, 5, 6, 7};
        findResult(array);

    }

    public static void findResult(int[] array) {
        int small = array[0];
        int big = array[0];

        for( int i=0; i< array.length; i ++) {
            if( small > array[i]) {
                small = array[i];
            }

            if( big < array[i]) {
                big = array[i];
            }
        }

        System.out.println(small + " " + big);
    }
}

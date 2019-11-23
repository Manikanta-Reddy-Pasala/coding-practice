package arrays;

public class SecondLargest {


    public static void main(String args[]) {

        int[] array = {1, 5, 6, 7, 4, 2,10};

        System.out.println(second_largest(array));

    }

    private static int second_largest(int[] array) {

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > largest) {

                second_largest = largest;
                largest = array[i];

            } else if (array[i] > second_largest) {
                second_largest = array[i];
            }

        }
        return second_largest;

    }
}

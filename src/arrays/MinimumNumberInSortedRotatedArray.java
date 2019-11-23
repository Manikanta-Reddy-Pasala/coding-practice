package arrays;

public class MinimumNumberInSortedRotatedArray {

    public static void main(String args[]) {

        int[] array = {16,19,21,25,3,5,8,10};

        System.out.println(findSolution(array));

    }

    private static int findSolution(int[] array) {

        int min = array[0];

        for(int i = 1; i < array.length; i ++) {

            if (min > array[i]) {
                min = array[i];
                return min;
            }
        }
        return min;
    }
}

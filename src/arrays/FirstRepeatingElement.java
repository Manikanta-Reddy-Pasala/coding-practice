package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatingElement {

    public static void main(String args[]) {

        int[] array = {10, 7, 8, 1, 8, 7, 6};

        findElement(array);

    }

    private static void findElement(int[] array) {

        Map<Integer,Integer> map = new HashMap<>();
        Integer[] dummy = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {

            if (map.containsKey(array[i])) {
                dummy[map.get(array[i])] = array[i];

            } else {
                map.put(array[i], i);
            }
        }

        for (int j=0; j< array.length; j ++) {

            if(dummy[j] != null){
                System.out.println(dummy[j]);
                break;
            }
        }

    }
}

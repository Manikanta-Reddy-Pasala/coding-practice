package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FindOddNumberOfOccurring {

    public static void main(String args[]) {

        int[] array = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};

        System.out.println(findOddNumberOfOccurring(array));

    }

    private static int findOddNumberOfOccurring(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();

        AtomicInteger result = new AtomicInteger();

        for (int i = 0; i < array.length; i++) {

            if (map.containsKey(array[i])) {
                int count = map.get(array[i]);
                map.put(array[i], count + 1);

            } else {
                map.put(array[i], 1);
            }
        }

        map.forEach((key, value) -> {

            if (value % 2 != 0) {

                result.set(key);

            }
        });

        return result.get();
    }
}

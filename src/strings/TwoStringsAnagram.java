package strings;

import java.util.Arrays;

public class TwoStringsAnagram {

    /*
    Two string are anagrams if they have same characters but in different order.
     */
    public static boolean checkForAnagrams_arrays_sort(String word1, String word2) {

        char[] word1_char_array = word1.toCharArray();
        char[] word2_char_array = word2.toCharArray();
        Arrays.sort(word1_char_array);
        Arrays.sort(word2_char_array);

        word1 = String.valueOf(word1_char_array);
        word2 = String.valueOf(word2_char_array);

        if (word1.equals(word2))
            return true;
        else
            return false;
    }

    public static boolean checkForAnagrams_string_functions(String word1, String word2) {

        boolean status = true;
        for (int i = 0; i < word1.length() - 1; i++) {

            if (word2.indexOf(word1.charAt(i)) == -1) {
                status = false;
            }
        }
        return status;
    }

    public static void main(String args[]) {

        System.out.println(checkForAnagrams_arrays_sort("mani", "mani"));
        System.out.println(checkForAnagrams_string_functions("java2blog", "aj2vabgol"));

    }
}

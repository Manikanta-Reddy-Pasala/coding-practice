package strings;

import java.util.HashSet;
import java.util.Set;

public class StringWithUniqueCharacters {

    public static void main(String args[]) {

        System.out.println(isHavingUniqueCharacters_using_string_index("mania"));
        System.out.println(isHavingUniqueCharacters_using_hash_set("mania"));
        System.out.println(isHavingUniqueCharacters_using_ascii("mania"));

    }

    public static boolean isHavingUniqueCharacters_using_string_index(String word) {

        for (int i = 0; i < word.length(); i++) {

            if (word.indexOf(word.charAt(i)) != word.lastIndexOf(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHavingUniqueCharacters_using_hash_set(String word) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {

            if (!set.add(word.charAt(i))) {
                return false;
            }
        }
        return true;

    }

    /*
    based on ascii values having one array of size 26
     */
    public static boolean isHavingUniqueCharacters_using_ascii(String word) {

        boolean[] chars = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            int index = (int) word.toUpperCase().charAt(i) - 64;

            if (!chars[index]) {
                chars[i] = true;
            } else {
                return false;
            }
        }
        return true;
    }
}

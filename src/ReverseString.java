public class ReverseString {

    public static String reverse_loop(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }

    public static String reverse_string_buffer(String word) {

        StringBuffer reversed = new StringBuffer(word);

        return reversed.reverse().toString();
    }

    public static String recursiveReverse(String word) {

        /*
        extracting the last character + using substring removing last character , repeat until the string length becomes 1
         */

        if (word.length() == 1) {
            return word;
        }
        return (word.charAt(word.length() - 1) + recursiveReverse(word.substring(0, word.length() - 1)));
    }


    public static void main(String args[]) {

        System.out.println(reverse_loop("manikanta reddy pasala"));
        System.out.println(reverse_string_buffer("manikanta reddy pasala"));
        System.out.println(recursiveReverse("manikanta reddy pasala"));

    }
}

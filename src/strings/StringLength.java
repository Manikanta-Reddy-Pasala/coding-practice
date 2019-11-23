package strings;

public class StringLength {

    public static void main(String args[]) {

        System.out.println(lengthOfArray("manikantareddypasala"));

    }

    /*
    iterating loop until character not found ">0" refers any digit/char/special char
     */
    public static int lengthOfArray(String word) {

        int i = 0;
        try {
            while (word.charAt(i) > 0) {
                i ++;
            }

        } catch (Exception e) {
            return i;

        }
        return i;
    }


}

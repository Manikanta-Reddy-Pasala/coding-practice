import sun.util.calendar.AbstractCalendar;

public class StringIsRotationOfAnotherString {

    public static void main(String args[]) {

        System.out.println(is_rotation_of_another_string("manikantareddypasala", "reddypasalamanikanta"));

    }

    /*
    S3 = S1 + s2
    check contains of s2 with s3
     if contains then
     */

    public static boolean is_rotation_of_another_string(String word1, String word2) {

        String s3 = word1 + word1;

        if (s3.contains(word2))
            return true;
        else
            return false;
    }
}

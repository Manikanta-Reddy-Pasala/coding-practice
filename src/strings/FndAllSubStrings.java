package strings;

public class FndAllSubStrings {

    public static void main(String args[]) {

        printSubStrings("manikantareddypasala");

    }

    public static void printSubStrings(String word) {

        for (int i=0; i< word.length(); i ++) {

            for (int j= i+1; j< word.length(); j ++) {
                System.out.println(word.substring(i,j));
            }
        }

    }
}

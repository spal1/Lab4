/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * Reclamation Project class.
 */
public class ReclamationProject {
    /**
     * Finds the LCS (Longest Common Substring) found in 2 strings.
     *
     * @param first a string
     * @param second a string
     * @return a String
     */
    static String doit(final String first, final String second) {
        String str1 = first;
        String str2 = second;
        if (str1.length() > str2.length()) {
            String temp = str1;
            //switch values of str1 and str2 using temporary string
            str1 = str2;
            str2 = temp;
        }
        //converts boolean value if string a = string b to string
        String s = (str1.equals(str2)) + "";

        /*
         * For loop that iterates through str1
         */
        for (int i = 0; i < str1.length(); i++) { //iterates from 0 to end of str1
            for (int j = str1.length() - i; j > 0; j--) { //iterates from end-i to beginning of str1
                for (int k = 0; k < str2.length() - j; k++) { //iterates from 0 to end of str2
                    if (str1.regionMatches(i, str2, k, j) && j > s.length()) {
                        s = str1.substring(i, i + j);
                    }
                }
            }
        }
        return s;
    }
}

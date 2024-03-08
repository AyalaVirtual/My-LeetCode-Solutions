public class ValidAnagram {
    /*
        Valid Anagram
        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

        Example 1:
        Input: s = "anagram", t = "nagaram"
        Output: true

        Example 2:
        Input: s = "rat", t = "car"
        Output: false
    */

    public boolean isAnagram(String s, String t) {
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        if (Arrays.equals(charArrayS, charArrayT)) {
            return true;
        } else {
            return false;
        }
    }

    /*
        Explanation:
        This approach uses the .toCharArray() method to convert both strings to character arrays and stores them in declared variables. From there, it uses the Arrays.sort() method to sort both arrays. It then uses a conditional to check the equality of both arrays using the Arrays.equal() method, in which two arrays are considered equal if both arrays contain the same number of elements, and they contain the same elements in the same order. Finally, it returns true or false, based on whether or not the arrays are equal.
     */
}

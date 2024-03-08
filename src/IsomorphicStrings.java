public class IsomorphicStrings {
    /*
        Isomorphic Strings
        Given two strings s and t, determine if they are isomorphic.

        Two strings s and t are isomorphic if the characters in s can be replaced to get t. (* Two strings are isomorphic if we can replace each character in the first string with a character from the second string such that the shape or structure of the string remains the same.)

        All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

        Example 1:
        Input: s = "egg", t = "add"
        Output: true

        Example 2:
        Input: s = "foo", t = "bar"
        Output: false

        Example 3:
        Input: s = "paper", t = "title"
        Output: true
    */

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();

        for (Integer i = 0; i < s.length(); i++) {
            if (map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i)) {
                return false;
            }
        }

        return true;
    }

    /*
        Explanation:
        This approach initializes two HashMaps to store mappings between characters in s and t, respectively. Then it sets up a for loop that iterates through the characters of the strings and uses a conditional to check if the result of adding the current character to map1 with its position (the current index) in the s string is not equal to adding the current character to map2 with its position (the current index) the t string. The .put() method returns the previous value associated with the specified key, or null if there was no mapping for the key. By using .put() instead of .get(), we compare the previous positions (or index values) of the character in both map1 and map2.

        If the positions stored in map1 and map2 for the current character are different, it means the character in the s string corresponds to a different character in the t string than before, so the characters are not isomorphic and the method returns false. Otherwise, it continues to the next iteration. If it breaks out of the loop without encountering any mismatches in the mappings, it will return true, meaning that the strings are isomorphic.
     */
}

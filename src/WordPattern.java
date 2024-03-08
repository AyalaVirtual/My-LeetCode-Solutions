public class WordPattern {
    /*
        Word Pattern
        Given a pattern and a string s, find if s follows the same pattern.
        Here, “follow” means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

        Example 1:
        Input: pattern = "abba", s = "dog cat cat dog"
        Output: true

        Example 2:
        Input: pattern = "abba", s = "dog cat cat fish"
        Output: false

        Example 3:
        Input: pattern = "aaaa", s = "dog cat cat dog"
        Output: false
    */

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, Integer> charToIndex = new HashMap();
        HashMap<String, Integer> stringToIndex = new HashMap();

        for (Integer i = 0; i < pattern.length(); i++) {
            if (charToIndex.put(pattern.charAt(i), i) != stringToIndex.put(words[i], i)) {
                return false;
            }
        }

        return true;
    }

    /*
        Explanation:
        This approach begins by splitting the string s into an array of strings where each string is separated by spaces using the .split() method. If the length of the words array does not match the length of the pattern string, the method returns false, since the pattern cannot align with the string.

        From there, it initializes 2 HashMaps, one (charToIndex) to associate characters in the pattern with their index, and the other (stringToIndex) to associate words in the string (or individual strings in the words array) with their index in the array.

        It then sets up a for loop and iterates through each character in the pattern, associating it with the corresponding word from the array of words. Inside an if/else statement, it uses the .put() method of each HashMap (one to associate the current character with its index in charToIndex, and the other to associate the current word with its index in stringToIndex) to check if the result of adding the current character of the pattern and its position (the current index) in the s string to the charToIndex hashmap is not equal to adding the current character to stringToIndex with its position (the current index) in the t string.

        The .put() method returns the previous value associated with the specified key, or null if there was no mapping for the key. By using .put() instead of .get(), we compare the previous positions (or index values) of the character in both charToIndex and stringToIndex. If they differ, it implies that the current character in the pattern maps to a different word in the string than previously encountered, breaking the pattern matching condition. Else, the method returns true, meaning the pattern matches the string.
     */
}

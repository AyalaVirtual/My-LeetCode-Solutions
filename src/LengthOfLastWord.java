public class LengthOfLastWord {
    /*
        Length of Last Word
        Given a string s consisting of words and spaces, return the length of the last word in the string.
        A word is a maximal substring consisting of non-space characters only.

         Example 1:
        Input: s = "Hello World"
        Output: 5
        Explanation: The last word is "World" with length 5.

        Example 2:
        Input: s = "   fly me   to   the moon  "
        Output: 4
        Explanation: The last word is "moon" with length 4.

        Example 3:
        Input: s = "luffy is still joyboy"
        Output: 6
        Explanation: The last word is "joyboy" with length 6.
    */

    public int lengthOfLastWord(String s) {
        String[] strArray = s.split(" ");
        int index = strArray.length - 1;
        String last = strArray[index];
        int length = last.length();

        return length;
    }

    /*
        Explanation:
        This approach starts by turning the string input into a String array using the .split() method and empty spaces as the delimiter that separates them. From there, it gets the index of the last word by subtracting 1 from the length of the array. It then uses the index to access the last word in the array and uses the .length() method to get the word’s length before returning it.
     */
}

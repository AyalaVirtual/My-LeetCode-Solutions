public class LongestCommonPrefix {
    /*
        Longest Common Prefix
        Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".

        Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"

        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
    */

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return prefix.toString();
                }
            }
            prefix.append(currentChar);
        }
        return prefix.toString();
    }

    /*
        Explanation:
        This approach starts off by initializing an empty StringBuilder that will gradually accumulate characters as we iterate through the first string of the array and eventually store the longest common prefix. It then sets up a for loop that will iterate through the characters of the first string. Inside this loop, we declare a variable to store the current character being analyzed.

        From there, we set up a nested for loop and use an if statement to compare the current character from the first string to the corresponding character in the rest of the strings. If the current iteration through the first string in the array is greater than (or goes beyond) the length of the remaining strings, or if the current character of the first string does not match the corresponding character in the subsequent strings, it will return the prefix in String form using the .toString() method.

        However, if the characters are equal, it will append the current character to the prefix. Finally, we return the prefix, converted to a String using the .toString() method.
     */
}

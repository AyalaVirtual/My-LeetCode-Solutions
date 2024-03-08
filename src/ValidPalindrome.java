public class ValidPalindrome {
    /*
        Valid Palindrome
        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
        Given a string s, return true if it is a palindrome, or false otherwise.

        Example 1:
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.

        Example 2:
        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.

        Example 3:
        Input: s = " "
        Output: true

        Explanation: s is an empty string "" after removing non-alphanumeric characters.
        Since an empty string reads the same forward and backward, it is a palindrome.
    */

    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder input = new StringBuilder();
        input.append(clean);
        String reversed = input.reverse().toString();


        if (clean.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    /*
        Explanation:
        This approach converts the string input to lowercase and removes all alphanumeric characters by chaining together the .toLowerCase() and .removeAll() methods, and stores it in a variable. Since strings are immutable, we then use the StringBuilder class and append the original string as a workaround and to give us access to the .reverse() method. We then convert it back into a string using the .toString() method again and use a conditional to check if the original string is equal to the reversed string before returning a boolean.
     */
}

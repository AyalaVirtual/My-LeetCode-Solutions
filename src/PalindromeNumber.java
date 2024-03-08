public class PalindromeNumber {
    /*
        Palindrome Number
        Given an integer x, return true if x is a palindrome (a word, phrase, number, or other sequence of characters that reads the same forward and backward), and false otherwise.

        Example 1:
        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.

        Example 2:
        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

        Example 3:
        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */

    public boolean isPalindrome(int x) {
        String stringInt = Integer.toString(x);
        StringBuilder input = new StringBuilder();
        input.append(stringInt);
        String reversed = input.reverse().toString();

        if (stringInt.equals(reversed)) {
            return true;
        } else  {
            return false;
        }
    }

    /*
        Explanation:
        This approach turns the integer into a string using the .toString() method. Since strings are immutable, we use the StringBuilder class and append the original string as a workaround and to give us access to the .reverse() method. We then convert it back into a string using the .toString() method again and use a conditional to check if the original string is equal to the reversed string before returning a boolean.
     */
}

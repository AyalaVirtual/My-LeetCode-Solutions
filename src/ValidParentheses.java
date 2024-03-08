public class ValidParentheses {
    /*
        Valid Parentheses
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

        Example 1:
        Input: s = "()"
        Output: true

        Example 2:
        Input: s = "()[]{}"
        Output: true

        Example 3:
        Input: s = "(]"
        Output: false
    */

    public boolean isValid(String s) {
       Deque<Character> charStack = new ArrayDeque<Character>();
        char [] charArr = s.toCharArray();


        for (char i : charArr) {
            if (i == '(') {
                charStack.push(')');
            } else if (i == '{') {
                charStack.push('}');
            } else if (i == '[') {
                charStack.push(']');
            } else if (charStack.isEmpty() || charStack.pop() != i) {
                return false;
            }
        }
        return charStack.isEmpty();
    }

    /*
        Explanation:
        This approach starts off by declaring a stack to keep track of the characters as we encounter them. Then it converts the input string to a character array using the .toCharArray() method, and loops through each character using an enhanced for loop.

        It then uses a conditional to check if the current character is an opening parenthesis, bracket, or curly brace, in which case it will push the corresponding closing character onto the stack.

        If the stack is empty, or if a closing parenthesis, bracket, or brace is encountered, and it is not equal to (or does not match) the most recently added (or top) character to the stack, then the string is invalid, and the method returns false.

        After looping through all the characters in the input string, it will return a boolean, which if the stack is empty, will return true because all the parentheses, brackets, or braces have been matched. Otherwise, it will return false.
     */
}

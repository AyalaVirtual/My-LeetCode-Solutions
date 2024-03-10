public class PowerOfThree {
    /*
        Power of Three
        Given an integer n, return true if it is a power of three (3 raised to some integer power, or the result of multiplying 3 by itself some number of times). Otherwise, return false.
        An integer n is a power of three, if there exists an integer x such that n == 3^x.

        Example 1:
        Input: n = 27
        Output: true
        Explanation: 27 = 3^3

        Example 2:
        Input: n = 0
        Output: false
        Explanation: There is no x where 3^x = 0.

        Example 3:
        Input: n = -1
        Output: false
        Explanation: There is no x where 3^x = (-1).
    */

    public boolean isPowerOfThree(int n) {
	  if (n == 1) {
            return true;
        } else if (n <= 0 || n % 3 == 1) {
            return false;
        } else {
            return isPowerOfThree(n / 3);
        }
    }

    /*
        Explanation:
        If n is equal to 1, it is a power of three. If n is less than or equal to 0 {therefore making it a negative integer or 0 itself), or if the remainder of n divided by 3 is equal to 1, then it is not a power of three. The final ‘else’ block uses recursion to handle edge cases, which would return false because they are not a power of 3.
     */
}

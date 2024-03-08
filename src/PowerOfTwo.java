public class PowerOfTwo {
    /*
        Power of Two
        Given an integer n, return true if it is a power of two (2 raised to some integer power, or the result of multiplying 2 by itself some number of times). Otherwise return false.
        An integer n is a power of two, if there exists an integer x such that n == 2x.

        Example 1:
        Input: n = 1
        Output: true
        Explanation: 20 = 1

        Example 2:
        Input: n = 16
        Output: true
        Explanation: 24 = 16

        Example 3:
        Input: n = 3
        Output: false
     */

    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else if (n <= 0 || n % 2 == 1) {
            return false;
        } else {
            return isPowerOfTwo(n / 2);
        }
    }

    /*
        Explanation:
        If n is equal to 1, it is a power of two. If n is less than or equal to 0 {therefore making it a negative integer or 0 itself), or if the remainder of n divided by 2 is equal to 1, then it is not a power of two. The final ‘else’ block uses recursion to handle cases such as if n = 6 or n = 10, which would return false because they are not a power of 2.
     */
}

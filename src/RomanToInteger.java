public class RomanToInteger {
    /*
        Roman to Integer
        Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
        Given a roman numeral, convert it to an integer.

        Example 1:
        Input: s = "III"
        Output: 3
        Explanation: III = 3.

        Example 2:
        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.

        Example 3:
        Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
    */

    public int romanToInt(String s) {
        int number = 0;
        int answer = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                number = 1;
            } else if (s.charAt(i) == 'V') {
                number = 5;
            } else if (s.charAt(i) == 'X') {
                number = 10;
            } else if (s.charAt(i) == 'L') {
                number = 50;
            } else if (s.charAt(i) == 'C') {
                number = 100;
            } else if (s.charAt(i) == 'D') {
                number = 500;
            } else if (s.charAt(i) == 'M') {
                number = 1000;
            }
            if (number < prev) {
                answer -= number;
            } else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }

    /*
        Explanation:
        This approach starts off by declaring several variables and setting them all equal to 0: ‘number’ represents the current number being analyzed for its value in Roman numerals, ‘answer’ represents the computed integer value of the Roman numeral string, and ‘prev’ represents the number that was previously analyzed.

        It then sets up a for loop that starts at the last index of the string and decreases by 1 as it iterates through the string from right to left. Using an if/else statement, it compares the character at the current index to its Roman numeral character and sets the current number variable equal to its corresponding integer value.

        From there, it enters another if/else block, where it determines whether to subtract or add the current number from the overall answer variable based on whether or not the current number is less than the previous number. It then sets the previous number equal to the current number before either continuing to loop through the string, or returning the computed integer value of the Roman numeral string.
     */
}

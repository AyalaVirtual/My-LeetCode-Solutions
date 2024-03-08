public class SingleNumber {
    /*
        Single Number
        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
        You must implement a solution with a linear runtime complexity and use only constant extra space.

        Example 1:
        Input: nums = [2,2,1]
        Output: 1

        Example 2:
        Input: nums = [4,1,2,1,2]
        Output: 4

        Example 3:
        Input: nums = [1]
        Output: 1
     */

    // Solution 1: XOR
    public int singleNumber(int[] nums) {
        /*
           Bitwise XOR (exclusive OR) "^" is an operator that returns true (or '1') if both values are different, if both values are the same, then the XOR operator returns false (or '0').
         */

        int uniqueNum = 0;

            for (int i : nums) {
            uniqueNum ^= i;
        }
            return uniqueNum;
    }

    /*
        Explanation:
        This approach initializes a variable representing the unique numbers in the nums array and sets it equal to zero. It then sets up a for loop that iterates through each index of the array and uses the bitwise XOR (exclusive OR) operator (that returns true, or '1', if both values are different, and returns false, or '0', if both values are the same). When an element appears twice in the array, the XOR operation cancels out its effects, leaving only the unique number in uniqueNum to be returned at the end of the loop.
    */



    // Solution 2: HashMaps
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> intMap = new HashMap();

        for (int i : nums) {
            if (intMap.containsKey(i)) {
                intMap.put(i, intMap.get(i) + 1);
            } else {
                intMap.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : intMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    /*
        Explanation:
        This approach initializes a HashMap to store the elements from the nums array and how many times each one appears. Then, using a for loop, it iterates through the array and uses a conditional to either increment the value (which is keeping track of the count) by 1 if the HashMap contains the element, or adds the element and its count to the HashMap as a (key, value) pair and initializes its count as 1.
        It then sets up another for loop to iterate through each (key, value) pair in the HashMap using the Map.Entry interface. Finally, using an if/else statement, it checks if the current element’s value is equal to 1, in which case it returns the element’s key. Otherwise, it will break out of the loop and return 0.
        */
}

public class ContainsDuplicate {
    /*
        Contains Duplicate
        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        Example 1:
        Input: nums = [1,2,3,1]
        Output: true

        Example 2:
        Input: nums = [1,2,3,4]
        Output: false

        Example 3:
        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true
    */

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }

        if (nums.length != numSet.size()) {
            return true;
        } else {
            return false;
        }
    }

    /*
        Explanation:
        This approach initializes a Set before setting up a for loop to iterate through each element in the nums array and add it to the set. It then uses an if/else statement to check whether or not the length of the nums array is equal to the size of the set. If they are not equal, it will return true, since a set cannot contain duplicate elements. Otherwise, it will return false.
     */
}

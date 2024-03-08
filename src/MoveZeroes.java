public class MoveZeroes {
    /*
        Move Zeroes
        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
        Note that you must do this in-place without making a copy of the array.

        Example 1:
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]

        Example 2:
        Input: nums = [0]
        Output: [0]
    */

    public void moveZeroes(int[] nums) {
        int i = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    /*
        Explanation:
        This approach initializes a variable to keep track of the index where non-zero elements should be placed. It then uses a for loop to iterate through each element in the nums array. Using an if/else statement, it checks that the current element is not equal to 0 before assigning it to the i index of the nums array, and incrementing i by 1. This moves all the non-zero elements to the beginning of the array while maintaining their relative order.

        Finally, it uses a while loop to set the element at the current index equal to 0 before incrementing the index by 1. This moves all the zeroes to the end of the array.
     */
}

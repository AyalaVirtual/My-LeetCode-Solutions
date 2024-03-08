public class SplitTheArray {
    /*
        Split the Array
        You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:
        nums1.length == nums2.length == nums.length / 2.
        nums1 should contain distinct elements.
        nums2 should also contain distinct elements.
        Return true if it is possible to split the array, and false otherwise.

        Example 1:
        Input: nums = [1,1,2,2,3,4]
        Output: true

        Explanation: One of the possible ways to split nums is nums1 = [1,2,3] and nums2 = [1,2,4].

        Example 2:
        Input: nums = [1,1,1,1]
        Output: false

        Explanation: The only possible way to split nums is nums1 = [1,1] and nums2 = [1,1]. Both nums1 and nums2 do not contain distinct elements. Therefore, we return false.
    */

    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> intMap = new HashMap();

        for (int i : nums) {
            if (intMap.containsKey(i)) {
                intMap.put(i, intMap.get(i) + 1);
            } else {
                intMap.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : intMap.entrySet()) {
            if (entry.getValue() > 2) {
                return false;
            }
        }

        return true;
    }

    */
        Explanation:
        This approach initializes a HashMap to store the elements from the nums array and how many times each one appears. Then, using a for loop, it iterates through the array and uses a conditional to either increment the value (which is keeping track of the count) by 1 if the HashMap contains the element, or adds the element and its count to the HashMap as a (key, value) pair and initializes its count as 1.

        It then sets up another for loop to iterate through each (key, value) pair in the HashMap using the Map.Entry interface. Finally, using a conditional, it checks if the current element’s value (or count) is greater than 2, in which case it returns false. Otherwise, it will break out of the loop and return true.
     */
}

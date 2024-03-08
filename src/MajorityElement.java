public class MajorityElement {
    /*
        Majority Element
        Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

        Example 1:
        Input: nums = [3,2,3]
        Output: 3

        Example 2:
        Input: nums = [2,2,1,1,1,2,2]
        Output: 2
     */

    // Solution 1: Sort
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        return nums[n / 2];
    }

    /*
        Explanation:
        This approach begins by sorting the array using the Arrays.sort() method to group the identical elements together. It then declares a variable n equal to the length of the nums array. Once the array is sorted, the majority element will always be present at index n/2 because it occurs more than n/2 times and will occupy the middle position. Finally, it returns the majority element.
     */



    // Solution 2: HashMaps
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> intMap = new HashMap();

        for (int i : nums) {
            if (intMap.containsKey(i)) {
                intMap.put(i, intMap.get(i) + 1);
            } else {
                intMap.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : intMap.entrySet()) {
            if (entry.getValue() > nums.length/2) {
                return entry.getKey();
            }
        }
        return 0;
    }

    /*
        Explanation:
        This approach initializes a HashMap to store the elements from the nums array and how many times each one appears. Then, using a for loop, it iterates through the array and uses a conditional to either increment the value (which is keeping track of the count) by 1 if the HashMap contains the element, or adds the element and its count to the HashMap as a (key, value) pair and initializes its count as 1.
        It then sets up another for loop to iterate through each (key, value) pair in the HashMap using the Map.Entry interface. Finally, using a conditional, it checks if the current element’s value is greater than half the length of the nums array, in which case it returns the element’s key. Otherwise, it will break out of the loop and return 0.
     */
}

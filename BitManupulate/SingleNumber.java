// Problem: Given a non-empty array of integers, every element appears twice except for one. Find that single one.
// Approach: Use XOR to find the single number in linear time and constant space.
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SingleNumber {

    // Method to find the single number
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    // Main method to test the singleNumber method
    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println("Single number in [2, 2, 1]: " + solution.singleNumber(nums1)); // Output: 1
        System.out.println("Single number in [4, 1, 2, 1, 2]: " + solution.singleNumber(nums2)); // Output: 4
        System.out.println("Single number in [1]: " + solution.singleNumber(nums3)); // Output: 1
    }
}


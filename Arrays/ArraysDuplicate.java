import java.util.*;

public class ArraysDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // If a consecutive duplicate is found, return true
            }
        }
        return false; // No duplicate found
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 1};

        System.out.println("nums1 contains duplicate: " + containsDuplicate(nums1));
        System.out.println("nums2 contains duplicate: " + containsDuplicate(nums2));
    }
}

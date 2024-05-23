import java.util.Arrays;
import java.util.Scanner;

class MedianOfTwoArr{

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedarr[] = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            mergedarr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            mergedarr[nums1.length + i] = nums2[i];
        }
        Arrays.sort(mergedarr);

        double median;
        if (mergedarr.length % 2 == 0) {
            int mid = mergedarr.length / 2;
            int midele1 = mergedarr[mid - 1];
            int midele2 = mergedarr[mid];
            median = (midele1 + midele2) / 2.0f;
        } else {
            median = mergedarr[mergedarr.length / 2];
        }
        return median;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of nums1 array:");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of nums1 array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of nums2 array:");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of nums2 array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of merged sorted arrays: " + median);
    }

  
}

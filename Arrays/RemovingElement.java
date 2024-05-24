public class RemovingElement {
    
    public int removeElement(int[] nums, int val) {
            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
    }
        public static void main(String[] args) {
            // Create an instance of Solution
            RemovingElement solution = new RemovingElement();
    
            // Sample input array and value to remove
            int[] nums = {3, 2, 2, 3};
            int val = 3;
    
            // Call the removeElement method
            int resultLength = solution.removeElement(nums, val);
    
            System.out.print("Modified Array: [");
            for (int i = 0; i < resultLength; i++) {
                System.out.print(nums[i]);
                if (i != resultLength - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            System.out.println("Result Length: " + resultLength);
        }
}

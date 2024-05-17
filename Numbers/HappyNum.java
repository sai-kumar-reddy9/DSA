public class HappyNum{
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1 || n == 7;
    }

    public static void main(String[] args) {
        HappyNum solution = new HappyNum();
        
        // Test cases
        int num1 = 19;
        int num2 = 2;
        
        System.out.println("Is " + num1 + " happy? " + solution.isHappy(num1)); // Output: true
        System.out.println("Is " + num2 + " happy? " + solution.isHappy(num2)); // Output: false
    }
}

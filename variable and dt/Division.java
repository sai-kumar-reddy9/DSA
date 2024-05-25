public class Division {


    class Solution {
        public int divide(int dividend, int divisor) {
            if(divisor==0) throw new ArithmeticException();
            if(dividend==0) return 0;
            if(divisor==1) return dividend;
            if(divisor==-1){
                if (dividend == Integer.MIN_VALUE) {
                    return Integer.MAX_VALUE;
                    }  else {
                    return -dividend;
                    }
            }
            boolean isNegative = (dividend < 0) ^ (divisor < 0);
    
            // Convert to positive
            long absDividend = Math.abs((long) dividend);
            long absDivisor = Math.abs((long) divisor);
    
            int result = 0;
    
              while (absDividend >= absDivisor) {
                long temp = absDivisor, multiple = 1;
                while (absDividend >= (temp << 1)) {
                    temp <<= 1;
                    multiple <<= 1;
                }
                absDividend -= temp;
                result += multiple;
            }
    
            // Apply sign
            result = isNegative ? -result : result;
    
            // Clamp result to 32-bit signed integer range
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
    
            return result;
        }
    }
    write the main method
    public static void main(String[] args) {
        Division solution = new Division();

        // Test cases
        int dividend1 = 10;
        int divisor1 = 3;
        int result1 = solution.divide(dividend1, divisor1);
        System.out.println("Result 1: " + result1); // Expected output: 3

        int dividend2 = 7;
        int divisor2 = -3;
        int result2 = solution.divide(dividend2, divisor2);
        System.out.println("Result 2: " + result2); // Expected output: -2

        int dividend3 = -2147483648; // Integer.MIN_VALUE
        int divisor3 = -1;
        int result3 = solution.divide(dividend3, divisor3);
        System.out.println("Result 3: " + result3); // Expected output: 2147483647 (Integer.MAX_VALUE)
    }
}

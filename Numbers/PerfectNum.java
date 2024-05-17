public class PerfectNum {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int i = 1;
        while (num > i) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        PerfectNum perfectNum = new PerfectNum();

        // Test cases
        int num1 = 6;
        int num2 = 28;
        int num3 = 12;

        System.out.println("Is " + num1 + " a perfect number? " + perfectNum.checkPerfectNumber(num1)); // Output: true
        System.out.println("Is " + num2 + " a perfect number? " + perfectNum.checkPerfectNumber(num2)); // Output: true
        System.out.println("Is " + num3 + " a perfect number? " + perfectNum.checkPerfectNumber(num3)); // Output: false
    }
}

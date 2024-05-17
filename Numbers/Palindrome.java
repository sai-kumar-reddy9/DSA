import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int m = x;
        int rev = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x /= 10;
        }
        return rev == m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Is " + num + " palindrome? " + palindrome.isPalindrome(num));
        
        sc.close();
    }
}

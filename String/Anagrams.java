
import java.util.Arrays;
public class Anagrams {
  
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        // Test case 1
        String str1 = "listen";
        String str2 = "silent";
        boolean result = isAnagram(str1, str2);
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + result);

        // Test case 2
        String str3 = "hello";
        String str4 = "bello";
        result = isAnagram(str3, str4);
        System.out.println("Are '" + str3 + "' and '" + str4 + "' anagrams? " + result);
    }
}

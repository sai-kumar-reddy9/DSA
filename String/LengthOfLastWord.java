public class LengthOfLastWord {
    public static void main(String[] args) {
        // Test cases
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Length of last word: " + lengthOfLastWord(s1)); // Output: 5
        System.out.println("Length of last word: " + lengthOfLastWord(s2)); // Output: 4
        System.out.println("Length of last word: " + lengthOfLastWord(s3)); // Output: 6
    }

    public static int lengthOfLastWord(String s) {
        // Trim any trailing spaces
        s = s.trim();

        // Split the string into words
        String[] words = s.split(" ");

        // Get the last word and return its length
        return words[words.length - 1].length();
    }
}


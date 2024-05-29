public class Reverseword{
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        
        // Split the string by one or more spaces
        String[] words = s.split("\\s+");
        
        // Use StringBuilder to efficiently build the reversed string
        StringBuilder reversedString = new StringBuilder();
        
        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }
        
        return reversedString.toString();
    }

    public static void main(String[] args) {
        // Test the reverseWords function
        String input = "the sky is blue";
        String result = reverseWords(input);
        System.out.println("Reversed: \"" + result + "\"");  // Expected output: "blue is sky the"
        
        // Additional test cases
        input = "  hello world  ";
        result = reverseWords(input);
        System.out.println("Reversed: \"" + result + "\"");  // Expected output: "world hello"
        
        input = "a good   example";
        result = reverseWords(input);
        System.out.println("Reversed: \"" + result + "\"");  // Expected output: "example good a"
    }
}


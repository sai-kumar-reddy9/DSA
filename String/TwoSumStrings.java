import java.util.HashMap;
import java.util.Map;

public class TwoSumStrings {
    public static int[] twoSumStrings(String[] words, String target) {
        // HashMap to store each string and its index
        Map<String, Integer> map = new HashMap<>();
        
        // Iterate through the list of strings
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            // Check if the target starts with the current word
            if (target.startsWith(word)) {
                // Calculate the remaining part of the target
                String remaining = target.substring(word.length());
                
                // Check if the remaining part exists in the map
                if (map.containsKey(remaining)) {
                    // Return the indices if found
                    return new int[] { map.get(remaining), i };
                }
            }
            
            // Store the current word and its index in the map
            map.put(word, i);
        }
        
        // Throw an exception if no solution is found (problem guarantees a solution)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Test case
        String[] words = {"ab", "c", "abc", "d", "cd"};
        String target = "abcd";
        int[] result = twoSumStrings(words, target);
        
        // Print the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

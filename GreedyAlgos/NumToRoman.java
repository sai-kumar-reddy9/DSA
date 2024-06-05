package GreedyAlgos;

public class NumToRoman {
        public String intToRoman(int num) {
            // Arrays of values and corresponding symbols
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
            // Initialize the result string
            StringBuilder romanNumeral = new StringBuilder();
    
            // Iterate through the value-symbol pairs
            for (int i = 0; i < values.length; i++) {
                // While the current number is greater than or equal to the value
                while (num >= values[i]) {
                    // Append the symbol to the result
                    romanNumeral.append(symbols[i]);
                    // Subtract the value from the number
                    num -= values[i];
                }
            }
    
            // Return the constructed Roman numeral as a string
            return romanNumeral.toString();
        }
    
        public static void main(String[] args) {
            NumToRoman solution = new NumToRoman();
    
            // Test cases
            int num1 = 3749;
            int num2 = 58;
            int num3 = 1994;
    
            System.out.println("Input: " + num1 + " -> Roman Numeral: " + solution.intToRoman(num1));
            System.out.println("Input: " + num2 + " -> Roman Numeral: " + solution.intToRoman(num2));
            System.out.println("Input: " + num3 + " -> Roman Numeral: " + solution.intToRoman(num3));
        }
    
    
}

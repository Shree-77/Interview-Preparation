package String_Problems;

import java.util.HashMap;
import java.util.Stack;

/**
 * Have the function StringChallenge (str) take the str parameter being passed and return a compressed version of the
 * string using the Run-length encoding algorithm. This algorithm works by taking the occurrence of each repeating character
 * and outputting that number along with a single character of the repeating sequence. For example: "wwwggopp" would return
 * 3w2g1o2p. The string will not contain any numbers, punctuation, or symbols.
 * Once your function is working, take the final output string and intersperse it character-by-character with your
 * Challenge Token.
 * Your Challenge Token: qoy5kueb4f
 *
 * Examples
 * Input: "aabbcde"
 * Output: 2a2b1c1d1e
 * Final Output: 2qao2yb51kculedb14ef

 * Input: "wwwbbbw"
 * Output: 3w3b1w
 * Final Output: 3qwo3yb51kwueb4f
 */

//ChatGpt solution
public class Encoding {
    public static void main(String[] args) {
        System.out.println(finalOutput("aabbcde", "qoy5kueb4f"));
    }

    public static String finalOutput(String str, String challengeToken) {
        StringBuilder compressedString = compress(str);
        StringBuilder finalOutput = new StringBuilder();

        int compressedLength = compressedString.length();
        int tokenLength = challengeToken.length();
        int i = 0, j = 0;

        // Interleave characters from compressed string and challenge token
        while (i < compressedLength && j < tokenLength) {
            finalOutput.append(compressedString.charAt(i++));
            finalOutput.append(challengeToken.charAt(j++));
        }

        // Append remaining characters from compressed string
        while (i < compressedLength) {
            finalOutput.append(compressedString.charAt(i++));
        }

        // Append remaining characters from challenge token
        while (j < tokenLength) {
            finalOutput.append(challengeToken.charAt(j++));
        }

        return finalOutput.toString();
    }

    public static StringBuilder compress(String str) {
        StringBuilder compressed = new StringBuilder();

        int count = 1;
        char prev = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == prev) {
                count++;
            } else {
                compressed.append(count).append(prev);
                count = 1;
                prev = str.charAt(i);
            }
        }

        // Append count and last character
        compressed.append(count).append(prev);

        return compressed;
    }
}

//my solution

/**
 *
 * public class Encoding {
 *     public static void main(String[] args) {
 *         System.out.println(finalOutput("wwwbbbw", "qoy5kueb4f"));
 *     }
 *
 *     public static String finalOutput(String output, String finalOutput) {
 *         output = runLengthEncoding(output);
 *         StringBuilder str = new StringBuilder();
 *
 *         int n1 = output.length();
 *         int n2 = finalOutput.length();
 *         int index = 0;
 *         int index1 = 0;
 *
 *         while (index < n1 && index1 < n2) {
 *             str.append(output.charAt(index));
 *             str.append(finalOutput.charAt(index1));
 *             index++;
 *             index1++;
 *         }
 *
 *         // Append remaining characters if any
 *         while (index < n1) {
 *             str.append(output.charAt(index));
 *             index++;
 *         }
 *         while (index1 < n2) {
 *             str.append(finalOutput.charAt(index1));
 *             index1++;
 *         }
 *
 *         return str.toString();
 *     }
 *
 *     public static String runLengthEncoding(String str) {
 *         Stack<Character> stack = new Stack<>();
 *         char[] ch = str.toCharArray();
 *         StringBuilder stringBuilder = new StringBuilder();
 *         char c = 'x';
 *         int count = 0; // Corrected: initialize count
 *
 *         for (char value : ch) {
 *             if (stack.isEmpty() || stack.peek() == value) {
 *                 stack.push(value);
 *                 count++;
 *             } else {
 *                 stringBuilder.append(count).append(stack.peek());
 *                 stack.clear();
 *                 stack.push(value);
 *                 count = 1;
 *             }
 *         }
 *
 *         // Append the count and character for the last sequence
 *         if (!stack.isEmpty()) {
 *             stringBuilder.append(count).append(stack.peek());
 *         }
 *
 *         return stringBuilder.toString();
 *     }
 * }
 */

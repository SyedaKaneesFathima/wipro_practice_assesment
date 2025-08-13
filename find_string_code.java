import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int findStringCode(String input1) {
        // Read only region end

        // Convert input to uppercase for uniform handling
        String[] words = input1.toUpperCase().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int sum = 0;
            int length = word.length();

            // Sum absolute differences between corresponding letters
            for (int i = 0; i < length / 2; i++) {
                char first = word.charAt(i);
                char last = word.charAt(length - 1 - i);
                sum += Math.abs((first - 'A' + 1) - (last - 'A' + 1));
            }

            // If word length is odd, add the center letter's value
            if (length % 2 != 0) {
                char center = word.charAt(length / 2);
                sum += center - 'A' + 1;
            }

            // Append sum for this word
            result.append(sum);
        }

        // Convert concatenated string to integer and return
        return Integer.parseInt(result.toString());
    }
}


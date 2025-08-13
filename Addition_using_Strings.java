import java.io.*;
import java.util.*;

class UserMainCode
{
    public String addNumberStrings(String input1, String input2) {
        StringBuilder result = new StringBuilder();

        int i = input1.length() - 1;
        int j = input2.length() - 1;
        int carry = 0;

        // Loop until both strings are processed
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? input1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? input2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);  
            carry = sum / 10;        
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}

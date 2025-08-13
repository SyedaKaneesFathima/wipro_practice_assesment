public class UserMainCode {
    public static int mostFrequentlyOccurringDigit(int[] input1, int input2) {
        int[] freq = new int[10];
        for (int i = 0; i < input2; i++) {
            int num = Math.abs(input1[i]); 
            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }
        int maxFreq = 0;
        int digitWithMaxFreq = 0;
        for (int d = 0; d <= 9; d++) {
            if (freq[d] > maxFreq) {
                maxFreq = freq[d];
                digitWithMaxFreq = d;
            }
        }
        
        return digitWithMaxFreq;
    }
    
    public static void main(String[] args) {
        int[] arr = {123, 456, 345, 111, 90};
        System.out.println("Most Frequent Digit: " + mostFrequentlyOccurringDigit(arr, arr.length));
    }
}

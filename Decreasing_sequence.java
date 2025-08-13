public Result decreasingSeq(int[] input1, int input2) {
    int maxLen = 0;    
    int currLen = 1;   
    for (int i = 1; i < input2; i++) {
        if (input1[i] < input1[i - 1]) {
            currLen++;
        } else {
            if (currLen > 1) {
                countSeq++;
                maxLen = Math.max(maxLen, currLen);
            }
            currLen = 1; 
        }
    }
    if (currLen > 1) {
        countSeq++;
        maxLen = Math.max(maxLen, currLen);
    }

    return new Result(countSeq, maxLen);
}

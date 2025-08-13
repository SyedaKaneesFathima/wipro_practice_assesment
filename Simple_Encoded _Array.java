public Result findOriginalFirstAndSum(int[] input1, int input2) {
    int[] original = new int[input2];
    original[input2 - 1] = input1[input2 - 1];
    for (int i = input2 - 2; i >= 0; i--) {
        original[i] = input1[i] - original[i + 1];
    }
    int first = original[0];
    int sum = 0;
    for (int num : original) {
        sum += num;
    }
    return new Result(first, sum);
}
}

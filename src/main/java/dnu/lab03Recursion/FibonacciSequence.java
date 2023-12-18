package dnu.lab03Recursion;

public class FibonacciSequence {
    public int recursionExecute(int n) {
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return recursionExecute(n - 1) + recursionExecute(n - 2);
            }
    }

    public int cycleExecute(int n) {
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            int temp = first;
            first = second;
            second = temp + second;
        }
        return first;
    }
}

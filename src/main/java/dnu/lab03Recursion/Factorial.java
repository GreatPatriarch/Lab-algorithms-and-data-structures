package dnu.lab03Recursion;

public class Factorial {
    public int recursionExecute(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursionExecute(n - 1);
        }
    }

    public int cycleExecute(int n) {
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }
}

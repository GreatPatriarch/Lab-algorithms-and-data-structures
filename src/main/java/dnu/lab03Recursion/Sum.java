package dnu.lab03Recursion;

public class Sum {
    public static  int execute(int num) {
        return num != 0 ? num % 10 + execute(num / 10) : 0;
    }
}

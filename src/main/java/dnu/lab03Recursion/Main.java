package dnu.lab03Recursion;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int N = 4;
        var factRec = factorial.recursionExecute(N);
        var factCyc = factorial.cycleExecute(N);
        assert factRec == factCyc: "different values";
        System.out.println("Факториал " + N + " = " + factRec);


        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        N = 6;
        int fibRec = fibonacciSequence.recursionExecute(N);
        int fibCyc = fibonacciSequence.cycleExecute(N);
        assert fibRec == fibCyc : "different values";
        System.out.println("Число Фибоначчи " + N + " = " + fibRec);


        int num = 12345;
        int sumDigits = Sum.execute(num);
        System.out.println("Сумма цифр числа " + num + " = " + sumDigits);

        int a = 15, b = 37;
        int sum = SumWithoutPlus.execute(a, b);
        System.out.println("Сумма " + a + " и " + b + " равна " + sum);
    }
}

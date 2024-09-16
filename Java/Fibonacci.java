public class Fibonacci {
    public static void main(String[] args) {
        int N = 10; 

        if (N <= 1) {
            System.out.println("N deve ser maior que 1.");
            return;
        }

        int[] fib = new int[N];
        fib[0] = 0;
        fib[1] = 1;

        System.out.print(fib[0] + " " + fib[1] + " ");

        for (int i = 2; i < N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
    }
}


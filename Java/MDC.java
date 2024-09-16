public class MDC {
    public static void main(String[] args) {
        int a = 48; 
        int b = 18; 

        int mdc = calcularMDC(a, b);
        System.out.println("O Máximo Divisor Comum (MDC) de " + a + " e " + b + " é: " + mdc);
    }

    private static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class Somatorio {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int somatorio = 0;

        for (int i = 0; i < numeros.length; i++) {
            somatorio += numeros[i];
        }

        System.out.println("O somatório é: " + somatorio);
    }
}

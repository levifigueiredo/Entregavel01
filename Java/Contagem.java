public class Contagem {
    public static void main(String[] args) {
        int[] dados = {1, 3, 5, 7, 9, 2, 8};
        int N = 10;
        int primeiro = dados[0];
        int contagem = 0;

        for (int i = 0; i < dados.length; i++) {
            if (dados[i] >= primeiro && dados[i] <= N) {
                contagem++;
            }
        }

        System.out.println("Número de valores entre " + primeiro + " e " + N + " (inclusive): " + contagem);
    }
}

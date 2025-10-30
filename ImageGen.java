public class ImageGen {

    // Método que gera um array de números aleatórios
    int[] gerarImagens(int tamanho) {
        int[] vetor = new int[20];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        return vetor; // Retorna o array gerado
    }

    // Método que imprime um array
    void imprimirVetor(int[] vetor) {
        for (int i=0; i<=vetor.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Método que ordena um array usando Bubble Sort
    void bubbleSort(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        ImageGen ig = new ImageGen();

        // Gerar números aleatórios
        int[] imagens = ig.gerarImagens(50);

        System.out.println("Vetor original:");
        ig.imprimirVetor(imagens);

        // Ordenar
        ig.bubbleSort(imagens);

        System.out.println("Vetor ordenado:");
        ig.imprimirVetor(imagens);
    }
}
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
        for (int i : vetor) {
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
    
    void InsertionSort(int[] vetor){
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i-1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
        System.out.println("\n\nOrdenado");
        for(int i=0; i < vetor.length; i++){
            
        }
    }
}
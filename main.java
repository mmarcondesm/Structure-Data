public class Main {
     public static void main(String[] args) {
        ImageGen ig = new ImageGen();

        // Gerar números aleatórios
        int[] imagens = ig.gerarImagens(50);

        System.out.println("Vetor original:");
        ig.imprimirVetor(imagens);

        System.out.println("Usando InsetionSort");
        ig.InsertionSort(imagens);

        ig.bubbleSort(imagens);

        System.out.println("Vetor ordenado:");
        ig.imprimirVetor(imagens);
    }
}

public class Main {
     public static void main(String[] args) {
        ImageGen ig = new ImageGen();

        // Gerar números aleatórios
        int[] imagens = ig.gerarImagens(50);

        

        
        System.out.println("Vetor original:");
        ig.imprimirVetor(imagens);

        

        
        ig.QuickSort(imagens, 0, imagens.length - 1);
        System.out.println("Quicksort");
        ig.imprimirVetor(imagens);


        ig.bubbleSort(imagens);
        System.out.println("Bubblesort");
        ig.imprimirVetor(imagens);

        ig.InsertionSort(imagens);
        System.out.println("InsertionSort");
        ig.imprimirVetor(imagens);

        


    }
}

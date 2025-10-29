package Java;

public class InsertionSort {

    public static void main(String[] args) {
        int[] vetor = new int[10];


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.random() * vetor.length;
            System.out.println(vetor[i]);
        }

        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i-1;
            while (j >= 0 && vetor[i] > aux) {
                vetor[j+1] = vetor[i];
                j--;
            }
        }
    }
}
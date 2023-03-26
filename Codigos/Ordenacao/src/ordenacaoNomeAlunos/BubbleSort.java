package ordenacaoNomeAlunos;

public class BubbleSort {
  
    public String[] bubbleSort(String[] vetor) {
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho; i++) {
            for (int j = i+1; j < tamanho; j++) {
                if(vetor[i].compareTo(vetor[j]) > 0) { 
                        String auxiliar = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = auxiliar;
                }
            }
        }
        return vetor;
    }
}

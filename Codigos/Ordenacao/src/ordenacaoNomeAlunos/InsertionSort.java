package ordenacaoNomeAlunos;

public class InsertionSort {
    public String[] insertionSort(String[] vetor){
        int tamanho = vetor.length;
        
        for (int i = 1; i < tamanho; i++) {
            String aux = vetor[i];
            int j = i - 1;
            
            while (j >= 0){               
                if (aux.compareTo(vetor[j]) > 0){
                    break;
                }
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
        return vetor;
    }
}

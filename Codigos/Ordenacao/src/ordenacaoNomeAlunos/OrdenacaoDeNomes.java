package ordenacaoNomeAlunos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoDeNomes {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/isado/OneDrive/Documentos/file2.txt");
        Scanner sc = new Scanner(System.in);
        BubbleSort bs = new BubbleSort();
        InsertionSort is = new InsertionSort();

        List<String> lines = Files.readAllLines(path);
        String[] notes = lines.toArray(new String[0]);
        
        System.out.println("Escolha a ordenacao");
        System.out.println("1 - BubbleSort");
        System.out.println("2 - InsertionSort");
        System.out.print("Opcao desejada: ");
        int op = sc.nextInt();
        
        while (op != 1 && op != 2){
            System.out.println("Opcao invalida");
            System.out.print("Opcao desejada: ");
            op = sc.nextInt();
        }
        
        if (op == 1)
            notes = bs.bubbleSort(notes);
        else
            notes = is.insertionSort(notes);
        
        System.out.println("\n--- Lista ordenada ---");
        for (String note: notes){
            System.out.println(note);
        }
    }
}

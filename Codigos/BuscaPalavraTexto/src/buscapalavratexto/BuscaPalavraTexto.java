package buscapalavratexto;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BuscaPalavraTexto {

    public static void main(String[] args) throws IOException{
        // Pega o caminho do arquivo que será lido
        Path path = Paths.get("");
        
        // Lê do teclado qual a palavra que deseja buscar no texto
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a palavra que deseja procurar: ");
        String palavra = sc.nextLine();
        
        // Chama a classe passando o caminho e a palavra, retornando a quantidade de vezes que aparece
        System.out.println("\nA palavra '" + palavra + "' aparece " + TrataArquivo.ler(path, palavra) + " vez(es) no arquivo");
    }    
}

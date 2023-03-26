package buscapalavratexto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.Normalizer;
import java.util.List;
import java.util.regex.Pattern;

public class TrataArquivo {
    public static int ler(Path path, String palavra) throws IOException {
        palavra = colocaMinusculo(palavra);
    
        List<String> lines = Files.readAllLines(path);
        
        int total = 0;
        for (String line: lines){
            String[] notes = line.split(" ");
            
            for (String note: notes){
                if (colocaMinusculo(note).equals(palavra)){
                    total += 1;
                }
            }
        }
        return total;
    }
    public static String removeAcentos(String palavra) {
        String normalizer = Normalizer.normalize(palavra, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizer).replaceAll("");
    }
    
    public static String removePontuacao(String palavra) {
        return removeAcentos(palavra.replaceAll("\\p{Punct}", ""));
    }
    
    public static String colocaMinusculo(String palavra) {
        return removePontuacao(palavra.toLowerCase());
    }
}

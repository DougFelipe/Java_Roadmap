
/*
Regex e Strings

Uso de expressões regulares com Strings para realizar operações como validação, divisão e busca.

Neste exemplo, utilizamos regex para dividir uma string em palavras.
*/
public class RegexAndStringsExercise {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String[] words = str.split("\W+");
        
        for (String word : words) {
            System.out.println(word);
        }
    }
}

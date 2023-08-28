
/*
Imutabilidade de Strings

Strings em Java são imutáveis, o que significa que seu conteúdo não pode ser alterado após a criação.

Neste exemplo, tentamos modificar uma string e demonstramos sua imutabilidade.
*/
public class StringImmutabilityExercise {
    public static void main(String[] args) {
        String str = "Hello";
        String modifiedStr = str.concat(" World");
        
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modifiedStr);
    }
}

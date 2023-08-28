
/*
Pesquisa em Strings

Uso de métodos como `contains()`, `startsWith()`, `endsWith()` e `indexOf()` para pesquisar em Strings.

Neste exemplo, demonstramos diferentes maneiras de pesquisar dentro de strings em Java.
*/
public class StringSearchExercise {
    public static void main(String[] args) {
        String str = "Hello World";
        
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'Java': " + str.endsWith("Java"));
        System.out.println("Index of 'World': " + str.indexOf("World"));
    }
}

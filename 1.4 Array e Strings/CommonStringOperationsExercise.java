
/*
Operações comuns em Strings

Métodos como `charAt()`, `length()`, `substring()`, `concat()`, `replace()`, e outros.

Neste exemplo, demonstramos algumas operações comuns que podemos realizar em strings.
*/
public class CommonStringOperationsExercise {
    public static void main(String[] args) {
        String str = "Hello World";
        
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Length of string: " + str.length());
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Concatenation: " + str.concat(" Again"));
        System.out.println("Replacement: " + str.replace("World", "Java"));
    }
}

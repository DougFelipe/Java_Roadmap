
/*
Métodos úteis da classe String

Métodos como `indexOf()`, `toLowerCase()`, `toUpperCase()`, `trim()` e outros.

Neste exemplo, demonstramos o uso de alguns métodos úteis da classe String.
*/
public class StringUsefulMethodsExercise {
    public static void main(String[] args) {
        String str = "  Hello World  ";
        
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("To lower case: " + str.toLowerCase());
        System.out.println("To upper case: " + str.toUpperCase());
        System.out.println("Trim: '" + str.trim() + "'");
    }
}

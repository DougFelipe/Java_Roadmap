
/*
Padrões comuns e anti-padrões

Reconhecer e aplicar padrões comuns de uso do `if` e evitar anti-padrões.

Neste exemplo, mostramos um padrão comum e um anti-padrão ao verificar a igualdade de duas strings.
*/
public class CommonPatternsAntipatternsExercise {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = null;

        // Padrão comum
        if ("Hello".equals(str1)) {
            System.out.println("str1 is 'Hello'.");
        }

        // Anti-padrão (pode causar NullPointerException)
        if (str2.equals("Hello")) {
            System.out.println("str2 is 'Hello'.");
        }
    }
}


/*
Evitando comparações ambíguas

Entender a importância de evitar comparações ambíguas, como comparar objetos com `==` em vez de usar métodos como `.equals()`.

Neste exemplo, mostramos a diferença entre usar `==` e `.equals()` para comparar strings.
*/
public class AvoidingAmbiguousComparisonsExercise {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Comparação incorreta
        if (str1 == str2) {
            System.out.println("Both strings are the same (using ==).");
        } else {
            System.out.println("Both strings are different (using ==).");
        }

        // Comparação correta
        if (str1.equals(str2)) {
            System.out.println("Both strings are the same (using .equals()).");
        } else {
            System.out.println("Both strings are different (using .equals()).");
        }
    }
}

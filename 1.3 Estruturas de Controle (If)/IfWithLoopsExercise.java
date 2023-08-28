
/*
Uso de `if` com loops

Integrar a estrutura `if` com loops, como `for` e `while`, para avaliações condicionais dentro de iterações.

Neste exemplo, usamos a estrutura `if` dentro de um loop `for` para filtrar números ímpares.
*/
public class IfWithLoopsExercise {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " is odd.");
            }
        }
    }
}


/*
Operadores de Resolução de Tipo

Como `::` em expressões lambda ou referências de método.

Neste exemplo, usamos o operador `::` para fazer uma referência a um método.
*/
import java.util.ArrayList;
import java.util.List;

public class TypeResolutionOperatorsExercise {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");

        // Usando o operador `::` para referenciar o método println
        items.forEach(System.out::println);
    }
}

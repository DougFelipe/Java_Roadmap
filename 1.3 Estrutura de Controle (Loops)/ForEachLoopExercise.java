
/*
Loop `for-each` (Java Enhanced Loop)

Introduzido no Java 5, permite iterar sobre arrays e coleções de maneira mais simplificada.

Neste exemplo, usamos o loop `for-each` para imprimir cada elemento de uma lista.
*/
import java.util.List;

public class ForEachLoopExercise {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

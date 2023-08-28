
/*
Uso de `if` em expressões lambda

Incorporar a estrutura `if` dentro de expressões lambda em Java 8+.

Neste exemplo, usamos uma expressão lambda com a estrutura `if` para filtrar números ímpares em uma lista.
*/
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IfWithLambdasExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isOdd = n -> {
            if (n % 2 != 0) {
                return true;
            }
            return false;
        };

        List<Integer> oddNumbers = numbers.stream().filter(isOdd).collect(Collectors.toList());
        System.out.println(oddNumbers);
    }
}

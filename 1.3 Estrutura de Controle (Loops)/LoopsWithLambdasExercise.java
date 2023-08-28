
/*
Uso de loops em expressões lambda (Java 8+)

Iterar sobre coleções usando expressões lambda e Stream API.

Neste exemplo, usamos expressões lambda para filtrar e modificar uma lista.
*/
import java.util.List;
import java.util.stream.Collectors;

public class LoopsWithLambdasExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenSquares = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .map(n -> n * n)
                                           .collect(Collectors.toList());
                                           
        System.out.println(evenSquares);
    }
}

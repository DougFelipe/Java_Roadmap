
/*
Loops e arrays

Usar loops, como o `for` e `foreach`, para iterar sobre os elementos de um array.

Neste exemplo, demonstramos o uso de um loop `for` e um loop `foreach` para iterar sobre um array e imprimir seus valores.
*/
public class LoopsAndArraysExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        System.out.println("\nUsing foreach loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

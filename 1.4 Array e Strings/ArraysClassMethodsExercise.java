
/*
Métodos úteis da classe Arrays

Métodos como `Arrays.sort()`, `Arrays.fill()`, `Arrays.equals()` e outros.

Neste exemplo, demonstramos o uso de alguns métodos úteis da classe Arrays.
*/
import java.util.Arrays;

public class ArraysClassMethodsExercise {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 4, 1};
        
        // Sort
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        // Fill
        Arrays.fill(numbers, 10);
        System.out.println("Array after fill: " + Arrays.toString(numbers));
        
        // Equals
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {1, 2, 3};
        System.out.println("Arrays are equal: " + Arrays.equals(numbers1, numbers2));
    }
}

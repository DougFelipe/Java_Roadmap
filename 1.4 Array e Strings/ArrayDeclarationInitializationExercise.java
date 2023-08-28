
/*
Declaração e inicialização de arrays

A sintaxe para declarar e inicializar arrays, bem como a diferença entre os dois.

Neste exemplo, demonstramos diferentes maneiras de declarar e inicializar arrays em Java.
*/
public class ArrayDeclarationInitializationExercise {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3;
        arr3 = new int[] {5, 4, 3, 2, 1};
        
        System.out.println("arr1 length: " + arr1.length);
        System.out.println("arr2 length: " + arr2.length);
        System.out.println("arr3 length: " + arr3.length);
    }
}

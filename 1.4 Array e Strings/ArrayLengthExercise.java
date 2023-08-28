
/*
Tamanho de um array

Usando a propriedade `.length` para determinar o tamanho de um array.

Neste exemplo, declaramos diferentes arrays e usamos a propriedade `.length` para imprimir seu tamanho.
*/
public class ArrayLengthExercise {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        char[] arr3 = {'a', 'b', 'c'};
        
        System.out.println("arr1 length: " + arr1.length);
        System.out.println("arr2 length: " + arr2.length);
        System.out.println("arr3 length: " + arr3.length);
    }
}

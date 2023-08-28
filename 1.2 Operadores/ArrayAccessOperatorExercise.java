
/*
Operador `[]`

Usado para acessar elementos de arrays.

Neste exemplo, usamos o operador `[]` para acessar e modificar elementos de um array.
*/
public class ArrayAccessOperatorExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Acessando o terceiro elemento (índice 2)
        int thirdElement = numbers[2];
        System.out.println("Third element: " + thirdElement);

        // Modificando o terceiro elemento
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);
    }
}

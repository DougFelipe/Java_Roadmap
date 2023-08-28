
/*
Acessando elementos do array

Como acessar e modificar elementos específicos de um array usando índices.

Neste exemplo, acessamos e modificamos alguns elementos de um array e imprimimos os resultados.
*/
public class ArrayAccessExercise {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original value at index 2: " + numbers[2]);
        
        numbers[2] = 35;
        System.out.println("Modified value at index 2: " + numbers[2]);
    }
}
